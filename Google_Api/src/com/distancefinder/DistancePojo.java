package com.distancefinder;

public class DistancePojo {

	private String status;

    private String[] destination_addresses;

    private String[] origin_addresses;
    private String text;
    private String value;

   
    public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String[] getDestination_addresses ()
    {
        return destination_addresses;
    }

    public void setDestination_addresses (String[] destination_addresses)
    {
        this.destination_addresses = destination_addresses;
    }

    public String[] getOrigin_addresses ()
    {
        return origin_addresses;
    }

    public void setOrigin_addresses (String[] origin_addresses)
    {
        this.origin_addresses = origin_addresses;
    }

   
	@Override
	public String toString() {
		return "DistancePojo [status=" + status + " text=" + text + " value=" + value +"]";
	}
}
