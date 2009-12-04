package fi.hut.soberit.agilefant.business;

import java.util.List;

import fi.hut.soberit.agilefant.model.Backlog;
import fi.hut.soberit.agilefant.model.Story;

public interface StoryRankBusiness {

    /**
     * Retrieve stories in the ranking order by backlog. Note that this method
     * may not return all the stories contained in the backlog, only the stories
     * that have rank will be returned.
     * 
     * @param backlog
     * @return
     */
    List<Story> retrieveByRankingContext(Backlog backlog);

    /**
     * Rank the given story below the given upper story with in the backlog
     * context.
     */
    void rankBelow(Story story, Backlog context, Story upper);

    /**
     * Move story between contexts and rank the given story below the given
     * upper story with in the backlog context.
     */
    void rankBelow(Story story, Backlog context, Backlog fromContext,
            Story upper);

    /**
     * Rank the given story above the lower story within the backlog context.
     */
    void rankAbove(Story story, Backlog context, Story lower);

    /**
     * Move story between contexts and rank the given story above the lower
     * story within the backlog context.
     */
    void rankAbove(Story story, Backlog context, Backlog fromContext,
            Story lower);

    void removeRank(Story story, Backlog context);
}
