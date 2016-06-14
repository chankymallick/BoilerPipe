/**
 * boilerpipe
 *
 * Copyright (c) 2009, 2014 Christian Kohlschütter
 *
 * The author licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kohlschutter.boilerpipe.demo;

import de.l3s.boilerpipe.document.TextDocument;
import de.l3s.boilerpipe.extractors.ArticleExtractor;
import de.l3s.boilerpipe.sax.BoilerpipeSAXInput;
import de.l3s.boilerpipe.sax.HTMLFetcher;
import java.net.URL;

import org.xml.sax.InputSource;

//import com.kohlschutter.boilerpipe.document.TextDocument;
//import com.kohlschutter.boilerpipe.extractors.ArticleExtractor;
//import com.kohlschutter.boilerpipe.sax.BoilerpipeSAXInput;
//import com.kohlschutter.boilerpipe.sax.HTMLFetcher;

/**
 * Demonstrates how to use Boilerpipe when working with {@link InputSource}s.
 */
public class UsingSAX {
  public static void main(final String[] args) throws Exception {
    URL url;
    url =new URL(" http://www.ndtv.com/india-news/ndtvs-ranveer-singh-farooq-abdullah-dance-off-goes-viral-watch-1273127?pfrom=home-lateststories");

    final InputSource is = HTMLFetcher.fetch(url).toInputSource();
    final BoilerpipeSAXInput in = new BoilerpipeSAXInput(is);
    final TextDocument doc = in.getTextDocument();
    System.out.println(ArticleExtractor.INSTANCE.getText(doc));
  
  }
}
