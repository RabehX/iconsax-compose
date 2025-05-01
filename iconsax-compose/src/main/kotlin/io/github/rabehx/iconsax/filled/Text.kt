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


val Iconsax.Filled.Text: ImageVector
    get() {
        if (_Text != null) {
            return _Text!!
        }
        _Text = ImageVector.Builder(
            name = "Filled.Text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(18.75f, 8.9f)
                curveTo(18.75f, 9.31f, 18.41f, 9.65f, 18f, 9.65f)
                curveTo(17.59f, 9.65f, 17.25f, 9.31f, 17.25f, 8.9f)
                verticalLineTo(7.72f)
                curveTo(17.25f, 7.4f, 16.99f, 7.14f, 16.67f, 7.14f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.86f)
                horizontalLineTo(14.53f)
                curveTo(14.94f, 16.86f, 15.28f, 17.2f, 15.28f, 17.61f)
                curveTo(15.28f, 18.02f, 14.94f, 18.36f, 14.53f, 18.36f)
                horizontalLineTo(9.47f)
                curveTo(9.06f, 18.36f, 8.72f, 18.02f, 8.72f, 17.61f)
                curveTo(8.72f, 17.2f, 9.06f, 16.86f, 9.47f, 16.86f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.14f)
                horizontalLineTo(7.33f)
                curveTo(7.01f, 7.14f, 6.75f, 7.4f, 6.75f, 7.72f)
                verticalLineTo(8.9f)
                curveTo(6.75f, 9.31f, 6.41f, 9.65f, 6f, 9.65f)
                curveTo(5.59f, 9.65f, 5.25f, 9.31f, 5.25f, 8.9f)
                verticalLineTo(7.72f)
                curveTo(5.25f, 6.57f, 6.18f, 5.64f, 7.33f, 5.64f)
                horizontalLineTo(16.66f)
                curveTo(17.81f, 5.64f, 18.74f, 6.57f, 18.74f, 7.72f)
                verticalLineTo(8.9f)
                horizontalLineTo(18.75f)
                close()
            }
        }.build()

        return _Text!!
    }

@Suppress("ObjectPropertyName")
private var _Text: ImageVector? = null
