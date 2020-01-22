package edu.escuelaing.arep;

public class CalculatorApp {
	
	
	
	/**
	 * Calculate the mean of a list of data
	 * @param linkedList - list of the data
	 * @return mean of the data
	 */
	public Double mean (LinkedListP<Double> linkedList) {
		Double result = 0.0;
		for (int i = 0; i < linkedList.size(); i++) {
			result+=linkedList.get(i);
		}
		result = result/linkedList.size();
		return result;
	}
	
	/**
	 * Calculate the standard Deviation of a list of data
	 * @param linkedList - list of the data
	 * @return standard deviation of the data
	 */
	public Double standarDeviation (LinkedListP<Double> linkedList) {
		Double result = 0.0;
		Double mean = this.mean(linkedList);
		return result;
	}

}
