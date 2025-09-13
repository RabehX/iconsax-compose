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


val Iconsax.Filled.TextBold: ImageVector
    get() {
        if (_TextBold != null) {
            return _TextBold!!
        }
        _TextBold = ImageVector.Builder(
            name = "Filled.TextBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.75f, 12.75f)
                horizontalLineTo(12.25f)
                horizontalLineTo(8.5f)
                verticalLineTo(16.74f)
                curveTo(8.5f, 17.02f, 8.73f, 17.25f, 9.01f, 17.25f)
                horizontalLineTo(13.75f)
                curveTo(14.99f, 17.25f, 16f, 16.24f, 16f, 15f)
                curveTo(16f, 13.76f, 14.99f, 12.75f, 13.75f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 9f)
                curveTo(14.5f, 7.76f, 13.49f, 6.75f, 12.25f, 6.75f)
                horizontalLineTo(9.01f)
                curveTo(8.73f, 6.75f, 8.5f, 6.98f, 8.5f, 7.26f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.25f)
                curveTo(13.49f, 11.25f, 14.5f, 10.24f, 14.5f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2f, 16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 2f, 7.41f, 2.01f, 7.22f, 2.03f)
                curveTo(3.94f, 2.24f, 2f, 4.37f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 17.68f, 2.36f, 18.92f, 3.05f, 19.87f)
                curveTo(3.34f, 20.29f, 3.71f, 20.66f, 4.13f, 20.95f)
                curveTo(4.95f, 21.55f, 5.99f, 21.9f, 7.22f, 21.98f)
                curveTo(7.41f, 21.99f, 7.61f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 6.32f, 21.64f, 5.08f, 20.95f, 4.13f)
                close()
                moveTo(13.75f, 18.75f)
                horizontalLineTo(9.01f)
                curveTo(7.9f, 18.75f, 7f, 17.85f, 7f, 16.74f)
                verticalLineTo(12f)
                verticalLineTo(7.26f)
                curveTo(7f, 6.15f, 7.9f, 5.25f, 9.01f, 5.25f)
                horizontalLineTo(12.25f)
                curveTo(14.32f, 5.25f, 16f, 6.93f, 16f, 9f)
                curveTo(16f, 9.96f, 15.63f, 10.83f, 15.03f, 11.49f)
                curveTo(16.46f, 12.02f, 17.5f, 13.38f, 17.5f, 15f)
                curveTo(17.5f, 17.07f, 15.82f, 18.75f, 13.75f, 18.75f)
                close()
            }
        }.build()

        return _TextBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextBold: ImageVector? = null
