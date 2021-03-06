package org.dataconservancy.cos.osf.client.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Links;
import com.github.jasminb.jsonapi.annotations.Type;
/**
 * Institution model for OSF
 * @author khanson
 *
 */
@Type("institutions")
public class Institution {

	/**unique institution identifier in the OSF*/
	@Id
	private String id;
	
	/**title of the institution*/
	private String name;
	
	/**a path to the institution's static logo*/
	private String logo_path;

    /**Gets other links found in data.links:{} section of JSON**/
	@Links
	Map<String, ?> links;       
		
    /**pagination links, applies when list is returned**/
    private org.dataconservancy.cos.osf.client.model.Links pageLinks;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo_path() {
		return logo_path;
	}

	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}

	public org.dataconservancy.cos.osf.client.model.Links getPageLinks() {
		return pageLinks;
	}

    @JsonProperty("links")
	public void setPageLinks(org.dataconservancy.cos.osf.client.model.Links pageLinks) {
		this.pageLinks = pageLinks;
	}

	public Map<String, ?> getLinks() {
		return links;
	}

	public void setLinks(Map<String, ?> links) {
		this.links = links;
	}
	
	
}
