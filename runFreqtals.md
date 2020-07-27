# Mining patterns from 2 commits of repository #
### Download freqtals-demo
Link download: ...

### Run runFreqtals script ###
- Go to freqtals-demo directory and run runFreqtals script as follow:
    `./runFreqtals repository_path old_commit_id new_commit_id minSup`
this cript will import ASTs then run freqtals on 2 given commits with the configuration given in `conf/config.properties`. After running this script, you can find the results in the output directory.

### Visualize patterns ###
- Open visualisation tool: go to `intimals-pharo` directory, right click on `Phara` program then click open. When the window open, choose `Intimals-8Apr.image` then click Open to launch the visualisation tool.
- Choose resources (at left-hand side of the window):
	- at first input dialogue: choose the directory that contains old_commit data (ex. input/sample_git_data/commit1)
	- at second input dialogue: choose the directory that contains new_commit data (ex. input/sample_git_data/commit2)
	- at third input dialogue: choose the directory that contains output data (ex. output)
	- at fourth input dialogue: input the file name of patterns (ex. sample_git_data_2_patterns.xml), then hit Enter button
	- at fifth input dialogue: input the file name of matches old_commit (ex. sample_git_data_2_matches_1.xml), then hit Enter button
	- at sixth input dialogue: input the file name of matches new_commit (ex. sample_git_data_2_matches_2.xml), then hit Enter button
- Click `Explore differences` to visualize the result.