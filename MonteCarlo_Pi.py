"""estimate pi by 3 decimal places 
by randomly generating (x,y) points between 0 and 1"""

def monteCarlo(iterations=100000):
    
    pointsInCircle = 0
    pointsInSquare = 0  # total
    
    # numpy array to store x,y
    data = np.zeros(shape=(iterations,2))
    
    for i in range(iterations):
        
        # random distribution between 0-1
        x = np.random.rand(1)
        y = np.random.rand(1)
        r = (x**2 + y**2)

        # store first 400 iterations of x,y into data array
        if(i < 400):
            data[i][0] = x
            data[i][1] = y
        
        # if point is inside circle
        if r <= 1:
            pointsInCircle+=1
        
        # total points
        pointsInSquare+=1
    
    # convert data
    x, y = data.T

    # get current axes
    ax = plt.gca()
    # plot circle
    circle = plt.Circle((.5, .5),.5, edgecolor='r', fill=False, linewidth=1)
    ax.add_artist(circle)
    # plot (x,y) points
    plt.scatter(x,y)
    plt.savefig('Circle.png')
    
    # if dimension of square is 1,1
    # then radius of circle is 1/2.
    # therefore, π(1/2)^2 = π/4
    return 4*(pointsInCircle / pointsInSquare)      
