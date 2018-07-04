package com.flipkart.protobuf.ext.generator.test.sample;

public class SearchRequest {
	private String query;
	private int page_number;
	private int result_per_page;
	private Corpus corpus;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public int getPage_number() {
		return page_number;
	}

	public void setPage_number(int page_number) {
		this.page_number = page_number;
	}

	public int getResult_per_page() {
		return result_per_page;
	}

	public void setResult_per_page(int result_per_page) {
		this.result_per_page = result_per_page;
	}

	public Corpus getCorpus() {
		return corpus;
	}

	public void setCorpus(Corpus corpus) {
		this.corpus = corpus;
	}
}
