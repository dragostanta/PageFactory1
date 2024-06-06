package tests;

public class GitResetCommands {
	
	
	
	/*
	 *  1. Reset all files from staging area
	 *  git reset  (muta toate fisierele din staging inapoi in working dir)
	 * 
	 *  2. Reset single file from stanging area
	 *  
	 *  git reset filename  (muta un sigur fisier din staging inapoi in working dir)
	 * 
	 *  3. reset a commit
	 *  
	 *  git reset HEAD^
	 *  
	 *  4. reset multiple commits
	 *  
	 *  git reset HEAD^~3
	 *  
	 *  --> git reset flags
	 *  
	 *  git reset --soft  (sterge comitul din istoric si muta fisiere in staging area)
	 *  
	 *  git reset --soft HEAD^
	 *  
	 *  git reset --mixed (sterge comitul din istoric si muta fisiere in working dir)
	 *  
	 *  git reset --hard (sterge comitul din istoric si fisiere)
	 *  
	 *  5. delete a commit from remote repo
	 *  
	 *  a> delete commit from local
	 *  	git reset HEAD^
	 *  b> push the change to remote which will delete the commit also from remote
	 *  	git push origin +HEAD
	 * 
	 * 
	 * 6. delete commit from remote only (keep on local)
	 * 
	 * 		git push origin +HEAD^:master
	 * 
	 * 
	 * 
	 */

}
