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

val Iconsax.Outline.SearchFavorite1: ImageVector
    get() {
        if (_SearchFavorite1 != null) {
            return _SearchFavorite1!!
        }
        _SearchFavorite1 = ImageVector.Builder(
            name = "Outline.SearchFavorite1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 21.75f)
                curveTo(5.85f, 21.75f, 1.25f, 17.15f, 1.25f, 11.5f)
                curveTo(1.25f, 5.85f, 5.85f, 1.25f, 11.5f, 1.25f)
                curveTo(11.91f, 1.25f, 12.25f, 1.59f, 12.25f, 2f)
                curveTo(12.25f, 2.41f, 11.91f, 2.75f, 11.5f, 2.75f)
                curveTo(6.67f, 2.75f, 2.75f, 6.68f, 2.75f, 11.5f)
                curveTo(2.75f, 16.32f, 6.67f, 20.25f, 11.5f, 20.25f)
                curveTo(16.33f, 20.25f, 20.25f, 16.32f, 20.25f, 11.5f)
                curveTo(20.25f, 11.09f, 20.59f, 10.75f, 21f, 10.75f)
                curveTo(21.41f, 10.75f, 21.75f, 11.09f, 21.75f, 11.5f)
                curveTo(21.75f, 17.15f, 17.15f, 21.75f, 11.5f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                curveTo(21.81f, 22.75f, 21.62f, 22.68f, 21.47f, 22.53f)
                lineTo(19.47f, 20.53f)
                curveTo(19.18f, 20.24f, 19.18f, 19.76f, 19.47f, 19.47f)
                curveTo(19.76f, 19.18f, 20.24f, 19.18f, 20.53f, 19.47f)
                lineTo(22.53f, 21.47f)
                curveTo(22.82f, 21.76f, 22.82f, 22.24f, 22.53f, 22.53f)
                curveTo(22.38f, 22.68f, 22.19f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 9.54f)
                curveTo(16.58f, 9.54f, 14.44f, 8.42f, 13.78f, 6.36f)
                curveTo(13.33f, 4.95f, 13.85f, 3.1f, 15.48f, 2.57f)
                curveTo(16.18f, 2.34f, 16.91f, 2.45f, 17.49f, 2.82f)
                curveTo(18.06f, 2.45f, 18.81f, 2.35f, 19.51f, 2.57f)
                curveTo(21.14f, 3.1f, 21.67f, 4.95f, 21.21f, 6.36f)
                curveTo(20.56f, 8.46f, 18.31f, 9.54f, 17.5f, 9.54f)
                close()
                moveTo(15.21f, 5.91f)
                curveTo(15.67f, 7.36f, 17.23f, 8.02f, 17.51f, 8.05f)
                curveTo(17.83f, 8.02f, 19.36f, 7.28f, 19.78f, 5.92f)
                curveTo(20.01f, 5.19f, 19.78f, 4.25f, 19.05f, 4.01f)
                curveTo(18.74f, 3.91f, 18.32f, 3.97f, 18.12f, 4.26f)
                curveTo(17.98f, 4.47f, 17.76f, 4.59f, 17.51f, 4.6f)
                curveTo(17.29f, 4.61f, 17.03f, 4.49f, 16.89f, 4.29f)
                curveTo(16.66f, 3.96f, 16.24f, 3.91f, 15.94f, 4f)
                curveTo(15.22f, 4.24f, 14.98f, 5.18f, 15.21f, 5.91f)
                close()
            }
        }.build()

        return _SearchFavorite1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchFavorite1: ImageVector? = null
