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


val Iconsax.Filled.FilterSquare: ImageVector
    get() {
        if (_FilterSquare != null) {
            return _FilterSquare!!
        }
        _FilterSquare = ImageVector.Builder(
            name = "Filled.FilterSquare",
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
                moveTo(8.46f, 10.68f)
                lineTo(7.97f, 10.17f)
                curveTo(7.71f, 9.91f, 7.5f, 9.44f, 7.5f, 9.12f)
                verticalLineTo(7.92f)
                curveTo(7.5f, 7.29f, 7.97f, 6.82f, 8.55f, 6.82f)
                horizontalLineTo(10.69f)
                curveTo(11.1f, 6.82f, 11.35f, 7.27f, 11.13f, 7.62f)
                lineTo(9.28f, 10.6f)
                curveTo(9.1f, 10.89f, 8.69f, 10.93f, 8.46f, 10.68f)
                close()
                moveTo(16.5f, 9.02f)
                curveTo(16.5f, 9.44f, 16.24f, 9.96f, 15.98f, 10.22f)
                lineTo(13.73f, 12.21f)
                curveTo(13.42f, 12.47f, 13.21f, 12.99f, 13.21f, 13.41f)
                verticalLineTo(15.66f)
                curveTo(13.21f, 15.97f, 13f, 16.39f, 12.74f, 16.55f)
                lineTo(12f, 17.02f)
                curveTo(11.32f, 17.44f, 10.38f, 16.97f, 10.38f, 16.13f)
                verticalLineTo(13.36f)
                curveTo(10.38f, 12.99f, 10.17f, 12.52f, 9.96f, 12.26f)
                lineTo(9.72f, 12f)
                curveTo(9.56f, 11.83f, 9.53f, 11.57f, 9.65f, 11.36f)
                lineTo(12.33f, 7.06f)
                curveTo(12.43f, 6.91f, 12.59f, 6.81f, 12.77f, 6.81f)
                horizontalLineTo(15.45f)
                curveTo(16.03f, 6.81f, 16.5f, 7.28f, 16.5f, 7.86f)
                verticalLineTo(9.02f)
                close()
            }
        }.build()

        return _FilterSquare!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSquare: ImageVector? = null
