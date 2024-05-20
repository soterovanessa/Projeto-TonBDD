package br.vanessas.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
				features ="src/test/resources/features/ton_bdd.feature",
				//tags ="~@ignore",
				tags = {},
				glue = "br.vsotero.steps",
				plugin = "pretty",
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				dryRun = false,
				strict = false)

public class Runner {

}