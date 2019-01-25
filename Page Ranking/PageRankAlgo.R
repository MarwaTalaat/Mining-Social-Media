#install.packages("igraph")
library(igraph) # import igraph library
MoviesMatrix <- matrix(c(
  0,0,1,1,0,0,
  1,0,1,0,1,0,
  0,1,0,0,0,1,
  0,1,0,0,0,1,
  0,1,1,0,0,0,
  0,1,0,0,1,0
), nrow=6, ncol=6) #draw a random matrix of 6 rows nd 6 column 
MoviesLabels <- c('I Feel Pretty', 'Wilding', 'Nawrt Masr', 'A Quiet Place', 'Truth or Dare', 'Breaking In')


dimnames(MoviesMatrix)[[2]] <- MoviesLabels
MoviesGraph <- graph.adjacency(MoviesMatrix, mode=c('directed'), weighted=NULL)
plot(MoviesGraph) # plot the graph

degree(MoviesGraph) # show its degree
shortest.paths(MoviesGraph) # find the shortest path between nodes

page.rank(MoviesGraph)$vector # calling pagerank algorithm and vector to normalize after each iteration