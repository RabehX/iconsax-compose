/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ProfileTick: ImageVector
    get() {
        if (_ProfileTick != null) {
            return _ProfileTick!!
        }
        _ProfileTick = ImageVector.Builder(
            name = "Outline.ProfileTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.961f, 21.32f)
                curveTo(15.771f, 21.32f, 15.581f, 21.25f, 15.431f, 21.1f)
                lineTo(13.911f, 19.58f)
                curveTo(13.621f, 19.29f, 13.621f, 18.81f, 13.911f, 18.52f)
                curveTo(14.201f, 18.23f, 14.681f, 18.23f, 14.971f, 18.52f)
                lineTo(15.961f, 19.51f)
                lineTo(18.471f, 17f)
                curveTo(18.761f, 16.71f, 19.241f, 16.71f, 19.531f, 17f)
                curveTo(19.821f, 17.29f, 19.821f, 17.77f, 19.531f, 18.06f)
                lineTo(16.491f, 21.1f)
                curveTo(16.341f, 21.25f, 16.151f, 21.32f, 15.961f, 21.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.161f, 11.62f)
                curveTo(12.131f, 11.62f, 12.111f, 11.62f, 12.081f, 11.62f)
                curveTo(12.031f, 11.61f, 11.961f, 11.61f, 11.901f, 11.62f)
                curveTo(9.001f, 11.53f, 6.811f, 9.25f, 6.811f, 6.44f)
                curveTo(6.801f, 5.06f, 7.341f, 3.76f, 8.321f, 2.78f)
                curveTo(9.301f, 1.8f, 10.601f, 1.25f, 11.991f, 1.25f)
                curveTo(14.851f, 1.25f, 17.181f, 3.58f, 17.181f, 6.44f)
                curveTo(17.181f, 9.25f, 14.991f, 11.52f, 12.191f, 11.62f)
                curveTo(12.181f, 11.62f, 12.171f, 11.62f, 12.161f, 11.62f)
                close()
                moveTo(11.991f, 2.75f)
                curveTo(11.001f, 2.75f, 10.081f, 3.14f, 9.381f, 3.83f)
                curveTo(8.691f, 4.53f, 8.311f, 5.45f, 8.311f, 6.43f)
                curveTo(8.311f, 8.43f, 9.871f, 10.05f, 11.861f, 10.11f)
                curveTo(11.921f, 10.1f, 12.051f, 10.1f, 12.181f, 10.11f)
                curveTo(14.151f, 10.02f, 15.681f, 8.41f, 15.681f, 6.43f)
                curveTo(15.681f, 4.41f, 14.021f, 2.75f, 11.991f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.99f, 22.56f)
                curveTo(9.95f, 22.56f, 8.02f, 22.03f, 6.56f, 21.05f)
                curveTo(5.17f, 20.12f, 4.41f, 18.85f, 4.41f, 17.48f)
                curveTo(4.41f, 16.11f, 5.18f, 14.85f, 6.56f, 13.93f)
                curveTo(9.55f, 11.93f, 14.41f, 11.93f, 17.4f, 13.93f)
                curveTo(17.74f, 14.16f, 17.84f, 14.63f, 17.61f, 14.97f)
                curveTo(17.38f, 15.32f, 16.91f, 15.41f, 16.57f, 15.18f)
                curveTo(14.08f, 13.52f, 9.88f, 13.52f, 7.39f, 15.18f)
                curveTo(6.43f, 15.82f, 5.91f, 16.63f, 5.91f, 17.48f)
                curveTo(5.91f, 18.33f, 6.43f, 19.16f, 7.39f, 19.8f)
                curveTo(8.6f, 20.61f, 10.23f, 21.05f, 11.98f, 21.05f)
                curveTo(12.39f, 21.05f, 12.73f, 21.39f, 12.73f, 21.8f)
                curveTo(12.73f, 22.21f, 12.4f, 22.56f, 11.99f, 22.56f)
                close()
            }
        }.build()

        return _ProfileTick!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileTick: ImageVector? = null
