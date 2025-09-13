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


val Iconsax.Filled.RefreshLeftSquare: ImageVector
    get() {
        if (_RefreshLeftSquare != null) {
            return _RefreshLeftSquare!!
        }
        _RefreshLeftSquare = ImageVector.Builder(
            name = "Filled.RefreshLeftSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(12f, 18.01f)
                curveTo(8.83f, 18.01f, 6.25f, 15.43f, 6.25f, 12.26f)
                curveTo(6.25f, 11.12f, 6.58f, 10.01f, 7.22f, 9.07f)
                curveTo(7.45f, 8.72f, 7.92f, 8.63f, 8.26f, 8.86f)
                curveTo(8.6f, 9.09f, 8.7f, 9.56f, 8.46f, 9.9f)
                curveTo(8f, 10.6f, 7.75f, 11.42f, 7.75f, 12.26f)
                curveTo(7.75f, 14.6f, 9.66f, 16.51f, 12f, 16.51f)
                curveTo(14.34f, 16.51f, 16.25f, 14.6f, 16.25f, 12.26f)
                curveTo(16.25f, 9.92f, 14.34f, 8.01f, 12f, 8.01f)
                curveTo(11.81f, 8.01f, 11.63f, 8.03f, 11.44f, 8.05f)
                lineTo(12f, 8.46f)
                curveTo(12.33f, 8.7f, 12.41f, 9.17f, 12.16f, 9.51f)
                curveTo(12.01f, 9.71f, 11.78f, 9.82f, 11.55f, 9.82f)
                curveTo(11.4f, 9.82f, 11.24f, 9.77f, 11.11f, 9.68f)
                lineTo(9.17f, 8.25f)
                curveTo(9.17f, 8.25f, 9.16f, 8.24f, 9.15f, 8.23f)
                curveTo(9.14f, 8.22f, 9.13f, 8.22f, 9.12f, 8.21f)
                curveTo(9.09f, 8.19f, 9.08f, 8.15f, 9.05f, 8.12f)
                curveTo(9.02f, 8.08f, 8.99f, 8.05f, 8.96f, 8f)
                curveTo(8.94f, 7.96f, 8.93f, 7.91f, 8.91f, 7.87f)
                curveTo(8.9f, 7.82f, 8.88f, 7.78f, 8.88f, 7.73f)
                curveTo(8.88f, 7.68f, 8.88f, 7.64f, 8.89f, 7.59f)
                curveTo(8.89f, 7.54f, 8.89f, 7.5f, 8.91f, 7.45f)
                curveTo(8.91f, 7.4f, 8.94f, 7.36f, 8.96f, 7.31f)
                curveTo(8.98f, 7.28f, 8.98f, 7.24f, 9.01f, 7.2f)
                curveTo(9.02f, 7.2f, 9.03f, 7.19f, 9.04f, 7.18f)
                curveTo(9.05f, 7.17f, 9.05f, 7.16f, 9.06f, 7.15f)
                lineTo(10.73f, 5.24f)
                curveTo(11f, 4.93f, 11.48f, 4.89f, 11.79f, 5.17f)
                curveTo(12.1f, 5.44f, 12.13f, 5.92f, 11.86f, 6.23f)
                lineTo(11.58f, 6.55f)
                curveTo(11.72f, 6.54f, 11.86f, 6.52f, 12.01f, 6.52f)
                curveTo(15.18f, 6.52f, 17.76f, 9.1f, 17.76f, 12.27f)
                curveTo(17.76f, 15.44f, 15.17f, 18.01f, 12f, 18.01f)
                close()
            }
        }.build()

        return _RefreshLeftSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshLeftSquare: ImageVector? = null
