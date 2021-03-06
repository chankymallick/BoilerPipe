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

import boilerpipe.ImageExtractor;
import boilerpipe.Image;
import de.l3s.boilerpipe.BoilerpipeExtractor;
import de.l3s.boilerpipe.extractors.CommonExtractors;
import boilerpipe.*;
import java.net.URL;
import java.util.Collections;
import java.util.List;

//import com.kohlschutter.boilerpipe.BoilerpipeExtractor;
//import com.kohlschutter.boilerpipe.document.Image;
//import com.kohlschutter.boilerpipe.extractors.CommonExtractors;
//import com.kohlschutter.boilerpipe.sax.ImageExtractor;

/**
 * Demonstrates how to use Boilerpipe to get the images within the main content.
 */
public final class ImageExtractorDemo {
  public static void main(String[] args) throws Exception {
    URL url = new URL("http://www.hindustantimes.com/india/pm-modi-insulted-people-of-kerala-by-stopping-chandy-rahul-gandhi/story-jmQRiRaklo6NA0KUSOxzyL.html");

    // choose from a set of useful BoilerpipeExtractors...
    final BoilerpipeExtractor extractor = CommonExtractors.CANOLA_EXTRACTOR;

    final ImageExtractor ie = ImageExtractor.INSTANCE;

    List<Image> imgUrls = ie.process(url, extractor);
      System.out.println(imgUrls.size());
    // automatically sorts them by decreasing area, i.e. most probable true positives come first
    Collections.sort(imgUrls);

    for (Image img : imgUrls) {
        if(!(img.toString().contains("http://")))
        System.out.println(url.toString() + img);
        else
         System.out.println( img);
    }

  }
  
}
