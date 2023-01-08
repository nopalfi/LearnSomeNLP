package xyz.nopalfi;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimenAnalysis {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hi, I am Nopal, and I like bread but i hate veggies";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> coreSentenceList = coreDocument.sentences();
        for (CoreSentence coreSentence : coreSentenceList) {
            String sentiment = coreSentence.sentiment();
            System.out.println(sentiment+"\t"+coreSentence);
        }
    }
}
