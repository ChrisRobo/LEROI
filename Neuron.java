import java.util.HashMap;

public class Neuron {
	
	// Maybe map string values to vectors of neurons
	//	* Events/experiences
	//  * Attributes/facts
	//  * "Reminds me of"
	
	// Maybe just have several vectors of neurons for each neuron (instead of mapping to the vectors)
	
	// Neurons represent all known entities
	
	// Vector of descriptive adjectives? Related nouns? Facts? Descriptions? Definitions? Related entities?
	
	private String value;
	private HashMap<String, Neuron> neighbors;
	
	public Neuron() {
		value = "";
		neighbors = new HashMap<String, Neuron>();
	}
	
	public Neuron(String val) {
		value = val;
		neighbors = new HashMap<String, Neuron>();
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String val) {
		value = val;
	}
	
	public void addNeighbor(String key) {
		neighbors.put(key, new Neuron(key));
	}
	
	public void addNeighbor(String key, String value) {
		neighbors.put(key, new Neuron(value));
	}
	
	public void addNeighbor(String key, Neuron neuron) {
		neighbors.put(key, neuron);
	}
	
	public Neuron getNeighbor(String key) {
		return neighbors.get(key);
	}
}