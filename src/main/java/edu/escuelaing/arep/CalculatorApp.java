package edu.escuelaing.arep;

public class CalculatorApp {
	
	
	
	/**
	 * Calculate the mean of a list of data
	 * @param linkedList - list of the data
	 * @return mean of the data
	 */
	public static Double mean (LinkedListP<Double> linkedList) {
		Double result = 0.0;
		for (int i = 0; i < linkedList.size(); i++) {
			result+=linkedList.get(i);
		}
		result = result/linkedList.size();
		result = result * Math.pow(10, 2);
		result = (double) Math.round(result);
        result = result/Math.pow(10, 2);
		return result;
	}
	
	/**
	 * Calculate the standard Deviation of a list of data
	 * @param linkedList - list of the data
	 * @return standard deviation of the data
	 */
	public static Double standarDeviation (LinkedListP<Double> linkedList) {
		Double result = 0.0;
		Double mean = mean(linkedList);
		Double sampleVariance = 0.0;
		for (int i = 0; i < linkedList.size(); i++) {
			sampleVariance+=Math.pow((linkedList.get(i)-mean), 2);
		}
		result = Math.sqrt(sampleVariance / (linkedList.size() - 1));
		result = result * Math.pow(10, 2);
		result = (double) Math.round(result);
        result = result/Math.pow(10, 2);
		return result;
	}

}
