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

val Iconsax.Outline.ProfileRemove: ImageVector
    get() {
        if (_ProfileRemove != null) {
            return _ProfileRemove!!
        }
        _ProfileRemove = ImageVector.Builder(
            name = "Outline.ProfileRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 19.75f)
                horizontalLineTo(15.5f)
                curveTo(15.09f, 19.75f, 14.75f, 19.41f, 14.75f, 19f)
                curveTo(14.75f, 18.59f, 15.09f, 18.25f, 15.5f, 18.25f)
                horizontalLineTo(19.5f)
                curveTo(19.91f, 18.25f, 20.25f, 18.59f, 20.25f, 19f)
                curveTo(20.25f, 19.41f, 19.91f, 19.75f, 19.5f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.151f, 11.62f)
                curveTo(12.121f, 11.62f, 12.101f, 11.62f, 12.071f, 11.62f)
                curveTo(12.011f, 11.61f, 11.951f, 11.62f, 11.891f, 11.62f)
                curveTo(8.991f, 11.53f, 6.801f, 9.25f, 6.801f, 6.44f)
                curveTo(6.801f, 3.58f, 9.131f, 1.25f, 11.991f, 1.25f)
                curveTo(14.851f, 1.25f, 17.181f, 3.58f, 17.181f, 6.44f)
                curveTo(17.171f, 9.25f, 14.971f, 11.53f, 12.181f, 11.62f)
                curveTo(12.171f, 11.62f, 12.161f, 11.62f, 12.151f, 11.62f)
                close()
                moveTo(11.991f, 2.75f)
                curveTo(9.961f, 2.75f, 8.301f, 4.41f, 8.301f, 6.44f)
                curveTo(8.301f, 8.44f, 9.861f, 10.05f, 11.851f, 10.12f)
                curveTo(11.911f, 10.11f, 12.041f, 10.11f, 12.171f, 10.12f)
                curveTo(14.131f, 10.03f, 15.671f, 8.42f, 15.681f, 6.44f)
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

        return _ProfileRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileRemove: ImageVector? = null
