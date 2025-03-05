import math

def getFare(Source, Destination):
    BusStops = ['TH', 'GA', 'IC', 'HA', 'TE', 'LU', 'NI','CA']
    Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
    
    fare = 0.0
    
    if not (Source in BusStops and Destination in BusStops):
            return 'INVALID INPUT'
    
    src_index = BusStops.index(Source)
    des_index = BusStops.index(Destination)
    
    if(src_index == des_index):
        return 'INVALID INPUT'
    
    if src_index < des_index:
        for i in range(src_index, des_index + 1):
            fare += Path[i]
    
    elif (src_index > des_index):
        for i in range(src_index + 1, len(BusStops)):
            fare += Path[i]
        for i in range(0, des_index + 1):
            fare += Path[i]
            
    return float(math.ceil(fare * 0.005))
        
    distance = min(clockwise_distance, counter_clockwise_distance)

s = input('Enter source: ')
d = input('Enter destination: ')
print(getFare(s.upper(), d.upper()))