package parsing;

import org.apache.jena.riot.RDFParser;
import org.apache.jena.riot.system.StreamRDF;

public class ParserExample {

	public static void main(String[] argvs) {
		String fileName = "/Users/kien/xsystem/testdata/dbpedia/dbpedia_data.ttl";
		// String fileName = "src/main/resources/test1.ttl";
		StreamRDF tripleHandler = new TripleHandler();

		// Call the parsing process.
		long start = System.currentTimeMillis();
		RDFParser.source(fileName).parse(tripleHandler);
		/*
		 * Note that you can also use RDFDataMgr as follows:
		 * RDFDataMgr.parse(tripleHandler, fileName); I am not sure what is the
		 * difference. After a quick evaluation, I think using RDFDataMrg (in Jena2) is
		 * faster than using RDFParser (in Jena3)
		 */
		long end = System.currentTimeMillis();
		long time = (end - start) / 1000;
		System.out.println("Parsing time (s): " + time);

	}
}
