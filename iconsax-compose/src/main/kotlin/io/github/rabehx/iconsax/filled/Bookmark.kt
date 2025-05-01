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


val Iconsax.Filled.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Filled.Bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(22f, 19.4f, 19.4f, 22f, 16.19f, 22f)
                horizontalLineTo(7.81f)
                curveTo(4.6f, 22f, 2f, 19.4f, 2f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2f, 5.32f, 3.02f, 3.51f, 4.83f, 2.63f)
                curveTo(5.49f, 2.31f, 6.25f, 2.81f, 6.25f, 3.54f)
                verticalLineTo(12.42f)
                curveTo(6.25f, 13.61f, 6.71f, 14.56f, 7.54f, 15.04f)
                curveTo(8.38f, 15.51f, 9.44f, 15.41f, 10.52f, 14.76f)
                lineTo(11.82f, 13.98f)
                curveTo(11.9f, 13.94f, 12.1f, 13.94f, 12.16f, 13.97f)
                lineTo(13.48f, 14.76f)
                curveTo(14.2f, 15.19f, 14.82f, 15.33f, 15.32f, 15.33f)
                curveTo(15.84f, 15.33f, 16.24f, 15.17f, 16.48f, 15.03f)
                curveTo(17.29f, 14.56f, 17.75f, 13.61f, 17.75f, 12.42f)
                verticalLineTo(3.54f)
                curveTo(17.75f, 2.81f, 18.52f, 2.31f, 19.17f, 2.63f)
                curveTo(20.98f, 3.51f, 22f, 5.32f, 22f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.25f, 2f)
                curveTo(15.8f, 2f, 16.25f, 2.45f, 16.25f, 3f)
                verticalLineTo(12.42f)
                curveTo(16.25f, 13.06f, 16.06f, 13.54f, 15.73f, 13.73f)
                curveTo(15.39f, 13.93f, 14.85f, 13.83f, 14.25f, 13.47f)
                lineTo(12.93f, 12.68f)
                curveTo(12.42f, 12.37f, 11.58f, 12.37f, 11.07f, 12.68f)
                lineTo(9.75f, 13.47f)
                curveTo(9.15f, 13.83f, 8.61f, 13.92f, 8.27f, 13.73f)
                curveTo(7.94f, 13.54f, 7.75f, 13.06f, 7.75f, 12.42f)
                verticalLineTo(3f)
                curveTo(7.75f, 2.45f, 8.2f, 2f, 8.75f, 2f)
                horizontalLineTo(15.25f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
