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

val Iconsax.Outline.Chart2: ImageVector
    get() {
        if (_Chart2 != null) {
            return _Chart2!!
        }
        _Chart2 = ImageVector.Builder(
            name = "Outline.Chart2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 19.25f)
                curveTo(13.98f, 19.25f, 12.75f, 18.02f, 12.75f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(12.75f, 5.98f, 13.98f, 4.75f, 15.5f, 4.75f)
                curveTo(17.02f, 4.75f, 18.25f, 5.98f, 18.25f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(18.25f, 18.02f, 17.02f, 19.25f, 15.5f, 19.25f)
                close()
                moveTo(15.5f, 6.25f)
                curveTo(14.81f, 6.25f, 14.25f, 6.81f, 14.25f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(14.25f, 17.19f, 14.81f, 17.75f, 15.5f, 17.75f)
                curveTo(16.19f, 17.75f, 16.75f, 17.19f, 16.75f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(16.75f, 6.81f, 16.19f, 6.25f, 15.5f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 19.25f)
                curveTo(6.98f, 19.25f, 5.75f, 18.02f, 5.75f, 16.5f)
                verticalLineTo(13f)
                curveTo(5.75f, 11.48f, 6.98f, 10.25f, 8.5f, 10.25f)
                curveTo(10.02f, 10.25f, 11.25f, 11.48f, 11.25f, 13f)
                verticalLineTo(16.5f)
                curveTo(11.25f, 18.02f, 10.02f, 19.25f, 8.5f, 19.25f)
                close()
                moveTo(8.5f, 11.75f)
                curveTo(7.81f, 11.75f, 7.25f, 12.31f, 7.25f, 13f)
                verticalLineTo(16.5f)
                curveTo(7.25f, 17.19f, 7.81f, 17.75f, 8.5f, 17.75f)
                curveTo(9.19f, 17.75f, 9.75f, 17.19f, 9.75f, 16.5f)
                verticalLineTo(13f)
                curveTo(9.75f, 12.31f, 9.19f, 11.75f, 8.5f, 11.75f)
                close()
            }
        }.build()

        return _Chart2!!
    }

@Suppress("ObjectPropertyName")
private var _Chart2: ImageVector? = null
