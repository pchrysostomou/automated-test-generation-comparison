# Automated Test Generation Comparison

## Aim of the Experiment
This repository contains a comparison between two different approaches to automated test generation. The evaluation was performed on two specific Java programs: a Triangle classification program and a SortMerge class. The goal was to evaluate a Search-Based Software Engineering (SBSE) technique against a local 1B-parameter language model to see which can effectively produce executable tests.

## Methodology and Tools
* **Environment:** The experiments were conducted on a Linux OS running Java 11.
* **Testing Framework:** JUnit 4.13.2 was utilized for test execution.
* **EvoSuite:** The EvoSuite tool was employed using the DynaMOSA algorithm to optimize for branch coverage. The tool was given a 60-second execution budget and was run five times per target class with varying random seeds.
* **Language Model:** A local instance of Ollama ran the llama3.2:1b model in CPU-only mode. The model was prompted to generate JUnit 4 test classes, and five separate generations were collected for each target without any feedback loop.

## Results

### EvoSuite Performance
* **Triangle:** The search-based tool successfully achieved 100% branch coverage across all runs, generating suites with 6-7 tests and mutation scores between 70% and 77%.
* **SortMerge:** It reached full branch coverage in most runs (averaging 85.6% overall due to one stagnated run). However, mutation scores remained at 0% because the tool generated shallow assertions rather than deep relational invariants.

### Language Model Performance
* The language model successfully produced Java files containing multiple test methods (around 4-7 per file). 
* However, the generated code consistently failed to compile. Common issues included syntax errors, incorrect API usages, missing imports, and the inclusion of conversational text. 
* Consequently, coverage and mutation metrics could not be evaluated for the LM approach.

## Conclusion
The findings indicate that search-based methods like EvoSuite provide reliable structural coverage (especially on independent branches), but may lack strong semantic checks on data-dependent algorithms. Conversely, the small local language model failed to produce valid, compilable test suites, highlighting the need for execution feedback and repair mechanisms when using small LLMs for code generation.
