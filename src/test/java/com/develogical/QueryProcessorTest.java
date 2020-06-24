package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void knowsWhoWroteRomeoAndJuliet() throws Exception {
    
    assertThat(queryProcessor.process("Who wrote Romeo And Juliet"), containsString("Shakespeare"));
  }

  @Test
  public void isNotCaseSensitive() throws Exception {
    assertThat(queryProcessor.process("who wrote romeo and juliet"), containsString("Shakespeare"));
    assertThat(queryProcessor.process("the stranger"), containsString("Albert Camus"));
  }

  @Test
  public void returnsMyTopTitlesIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), containsString("Ulysses by James Joyce"));
  }
}
