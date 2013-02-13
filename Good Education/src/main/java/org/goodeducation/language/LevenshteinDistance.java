package org.goodeducation.language;



import java.util.*;

/**
 * Copyright (C) 2013 by Scott Byrns
 * http://github.com/scottbyrns
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * <p/>
 * Created 2/3/13 2:36 AM
 */
public class LevenshteinDistance {
        private static int minimum(int a, int b, int c) {
                return Math.min(Math.min(a, b), c);
        }

        public static int computeLevenshteinDistance(String str1,
                        String str2) {
//                int[][] distance = new int[str1.length() + 1][str2.length() + 1];
//
//                for (int i = 0; i <= str1.length(); i++)
//                        distance[i][0] = i;
//                for (int j = 1; j <= str2.length(); j++)
//                        distance[0][j] = j;
//
//                for (int i = 1; i <= str1.length(); i++)
//                        for (int j = 1; j <= str2.length(); j++)
//                                distance[i][j] = minimum(
//                                                distance[i - 1][j] + 1,
//                                                distance[i][j - 1] + 1,
//                                                distance[i - 1][j - 1]
//                                                                + ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0
//                                                                                : 1));

//                return distance[str1.length()][str2.length()];// * (str1.length()/str2.length());
            return score(str1, str2);
        }

    public static int score(String first, String second) {

                  // Create two sets of character bigrams, one for each string.
                  Set<String> s1 = splitIntoBigrams(first);
                  Set<String> s2 = splitIntoBigrams(second);

                  // Get the number of elements in each set.
                  int n1 = s1.size();
                  int n2 = s2.size();

                  // Find the intersection, and get the number of elements in that set.
                  s1.retainAll(s2);
                  int nt = s1.size();


                  // The coefficient is:
                  //
                  //        2 ∙ | s1 ⋂ s2 |
                  // D = ----------------------
                  //        | s1 | + | s2 |
                  //
                  double out =  (2.0 * (double)nt) / ((double)(n1 + n2));
                    out = (out + scoreReverse(first, second)) / 2;
                return (int)(Math.abs(out - 1) * 10);

          }

        private static double scoreReverse(String first, String second) {
                              // Create two sets of character bigrams, one for each string.
                  Set<String> s1 = splitIntoBigrams(reverseString(first));
                  Set<String> s2 = splitIntoBigrams(second);

                  // Get the number of elements in each set.
                  int n1 = s1.size();
                  int n2 = s2.size();

                  // Find the intersection, and get the number of elements in that set.
                  s1.retainAll(s2);
                  int nt = s1.size();


                  // The coefficient is:
                  //
                  //        2 ∙ | s1 ⋂ s2 |
                  // D = ----------------------
                  //        | s1 | + | s2 |
                  //
                  double out =  (2.0 * (double)nt) / ((double)(n1 + n2));

                return out;
        }

    private static String reverseString (String string) {
        String[] strings = string.split(" ");

        List < String > list = Arrays.asList(strings);
        Collections.reverse(list);
        String[] rev = ((String[])list.toArray(list.toArray()));

        string = "";
        for (int i = 0; i < rev.length; i += 1) {
            string.concat(rev[i]).concat(" ");
        }
        return string;
//        return list.toArray();
    }


          private static Set<String> splitIntoBigrams(String s) {
                  ArrayList<String> bigrams = new ArrayList<String>();

                  if (s.length() < 2) {
                          bigrams.add(s);
                  }
                  else {
                          for (int i = 1; i < s.length(); i++) {
                                  StringBuilder sb = new StringBuilder();
                                  sb.append(s.charAt(i-1));
                                  sb.append(s.charAt(i));
                                  bigrams.add(sb.toString());
                          }
                  }
                  return new TreeSet<String>(bigrams);
          }

}