package net.wyun.exo;

import java.io.IOException;
import java.io.Reader;

import org.ansj.lucene3.AnsjAnalysis;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;

public class CarAnalyzer extends Analyzer {

	private static final Log log = ExoLogger.getLogger(CarAnalyzer.class.getName());
	@Override
	public TokenStream tokenStream(String fieldName, Reader reader) {
        Analyzer ca = new AnsjAnalysis();
        log.info("field Name: " + fieldName);
        TokenStream ts = ca.tokenStream(fieldName, reader);
        try {
			while (ts.incrementToken()) {
			    log.info(ts.getAttribute(CharTermAttribute.class));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
        ca.close();
	    return ts; 
	}

}
