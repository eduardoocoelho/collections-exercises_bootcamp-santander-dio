package main;

import java.util.Objects;

public class Task {
	
	private String description;
	private boolean finished;
	
	public Task(String description, boolean finished) {
		this.description = description;
		this.finished = finished;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(description, other.description);
	}
	
	@Override
	  public String toString() {
	    return "{" + description + "," + finished + "}";
	  }
	
}
