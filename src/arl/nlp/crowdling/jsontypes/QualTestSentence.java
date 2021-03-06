/*
 *
 * This file is part of ARL CrowdTree and is subject to the following:
 * 
 * Copyright 2018 United States Government and Nhien Phan
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *   
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  
 */

package arl.nlp.crowdling.jsontypes;

import java.io.Serializable;

/**
 * 
 * For JSON I/O using Jackson or similar library
 */
public class QualTestSentence implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** The root node */
	private D3TreeNodeWrapper root;
	/** The sentence ID */
	private String sid;
	
	public D3TreeNodeWrapper getRoot() {
		return this.root;
	}
	public void setRoot(D3TreeNodeWrapper root) {
		this.root = root;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSid() {
		return this.sid;
	}

}
