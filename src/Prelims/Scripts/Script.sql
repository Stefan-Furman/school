SELECT sUserName, [dtTmCollected], (12 - HOUR([dtTmCollected]))*50 AS cost
FROM [Users] 
INNER JOIN [Rentals]
ON pklUserID = [fklUserID]
WHERE [dtTmReturned] IS NULL
