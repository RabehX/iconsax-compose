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

val Iconsax.Outline.More: ImageVector
    get() {
        if (_More != null) {
            return _More!!
        }
        _More = ImageVector.Builder(
            name = "Outline.More",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 14.75f)
                curveTo(3.48f, 14.75f, 2.25f, 13.52f, 2.25f, 12f)
                curveTo(2.25f, 10.48f, 3.48f, 9.25f, 5f, 9.25f)
                curveTo(6.52f, 9.25f, 7.75f, 10.48f, 7.75f, 12f)
                curveTo(7.75f, 13.52f, 6.52f, 14.75f, 5f, 14.75f)
                close()
                moveTo(5f, 10.75f)
                curveTo(4.31f, 10.75f, 3.75f, 11.31f, 3.75f, 12f)
                curveTo(3.75f, 12.69f, 4.31f, 13.25f, 5f, 13.25f)
                curveTo(5.69f, 13.25f, 6.25f, 12.69f, 6.25f, 12f)
                curveTo(6.25f, 11.31f, 5.69f, 10.75f, 5f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 14.75f)
                curveTo(17.48f, 14.75f, 16.25f, 13.52f, 16.25f, 12f)
                curveTo(16.25f, 10.48f, 17.48f, 9.25f, 19f, 9.25f)
                curveTo(20.52f, 9.25f, 21.75f, 10.48f, 21.75f, 12f)
                curveTo(21.75f, 13.52f, 20.52f, 14.75f, 19f, 14.75f)
                close()
                moveTo(19f, 10.75f)
                curveTo(18.31f, 10.75f, 17.75f, 11.31f, 17.75f, 12f)
                curveTo(17.75f, 12.69f, 18.31f, 13.25f, 19f, 13.25f)
                curveTo(19.69f, 13.25f, 20.25f, 12.69f, 20.25f, 12f)
                curveTo(20.25f, 11.31f, 19.69f, 10.75f, 19f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(10.48f, 14.75f, 9.25f, 13.52f, 9.25f, 12f)
                curveTo(9.25f, 10.48f, 10.48f, 9.25f, 12f, 9.25f)
                curveTo(13.52f, 9.25f, 14.75f, 10.48f, 14.75f, 12f)
                curveTo(14.75f, 13.52f, 13.52f, 14.75f, 12f, 14.75f)
                close()
                moveTo(12f, 10.75f)
                curveTo(11.31f, 10.75f, 10.75f, 11.31f, 10.75f, 12f)
                curveTo(10.75f, 12.69f, 11.31f, 13.25f, 12f, 13.25f)
                curveTo(12.69f, 13.25f, 13.25f, 12.69f, 13.25f, 12f)
                curveTo(13.25f, 11.31f, 12.69f, 10.75f, 12f, 10.75f)
                close()
            }
        }.build()

        return _More!!
    }

@Suppress("ObjectPropertyName")
private var _More: ImageVector? = null
