/**
 * 
 */
package net.wyun.exo;

import org.apache.lucene.analysis.Analyzer;
import org.exoplatform.container.configuration.ConfigurationManager;
import org.exoplatform.services.jcr.config.QueryHandlerEntry;
import org.exoplatform.services.jcr.impl.core.query.lucene.SearchIndex;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;

/**
 * @author michael
 *
 */
public class CarSearchIndex extends SearchIndex{
	
	private static final Log log = ExoLogger.getLogger(CarSearchIndex.class.getName());
	
	public CarSearchIndex(QueryHandlerEntry queryHandlerConfig, ConfigurationManager cfm) {
		
	    super();
	    log.info("query hander" + queryHandlerConfig.QUERY_HANDLER);
	  }

	  public Analyzer getTextAnalyzer() {
	    return new CarAnalyzer();
	}

}
