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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.SearchFavorite1: ImageVector
    get() {
        if (_SearchFavorite1 != null) {
            return _SearchFavorite1!!
        }
        _SearchFavorite1 = ImageVector.Builder(
            name = "Filled.SearchFavorite1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.301f, 21.999f)
                curveTo(21.121f, 21.999f, 20.941f, 21.929f, 20.81f, 21.799f)
                lineTo(18.951f, 19.939f)
                curveTo(18.681f, 19.669f, 18.681f, 19.229f, 18.951f, 18.949f)
                curveTo(19.221f, 18.679f, 19.66f, 18.679f, 19.941f, 18.949f)
                lineTo(21.801f, 20.809f)
                curveTo(22.07f, 21.079f, 22.07f, 21.519f, 21.801f, 21.799f)
                curveTo(21.66f, 21.929f, 21.48f, 21.999f, 21.301f, 21.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 2f)
                curveTo(6.26f, 2f, 2f, 6.26f, 2f, 11.5f)
                curveTo(2f, 16.74f, 6.26f, 21f, 11.5f, 21f)
                curveTo(16.74f, 21f, 21f, 16.74f, 21f, 11.5f)
                curveTo(21f, 6.26f, 16.74f, 2f, 11.5f, 2f)
                close()
                moveTo(14.68f, 12.06f)
                curveTo(14.12f, 13.84f, 12.17f, 14.81f, 11.5f, 14.81f)
                curveTo(10.81f, 14.81f, 8.9f, 13.88f, 8.32f, 12.06f)
                curveTo(7.94f, 10.87f, 8.37f, 9.32f, 9.73f, 8.89f)
                curveTo(10.35f, 8.69f, 11.01f, 8.81f, 11.5f, 9.18f)
                curveTo(11.98f, 8.81f, 12.65f, 8.69f, 13.28f, 8.89f)
                curveTo(14.63f, 9.33f, 15.06f, 10.88f, 14.68f, 12.06f)
                close()
            }
        }.build()

        return _SearchFavorite1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchFavorite1: ImageVector? = null
