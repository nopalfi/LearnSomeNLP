package xyz.nopalfi;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognizer {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hi! This is a test of stanford NLP core library for Natural Language Processing Process.";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> coreDocumentList = coreDocument.sentences();
        for (CoreSentence coreSentence : coreDocumentList) {
            System.out.println(coreSentence.toString());
        }
    }
}
