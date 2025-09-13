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


val Iconsax.Filled.RefreshRightSquare: ImageVector
    get() {
        if (_RefreshRightSquare != null) {
            return _RefreshRightSquare!!
        }
        _RefreshRightSquare = ImageVector.Builder(
            name = "Filled.RefreshRightSquare",
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
                curveTo(6.25f, 9.09f, 8.83f, 6.51f, 12f, 6.51f)
                curveTo(12.14f, 6.51f, 12.29f, 6.53f, 12.43f, 6.54f)
                lineTo(12.15f, 6.22f)
                curveTo(11.88f, 5.91f, 11.91f, 5.43f, 12.22f, 5.16f)
                curveTo(12.53f, 4.89f, 13.01f, 4.92f, 13.28f, 5.23f)
                lineTo(14.95f, 7.14f)
                curveTo(14.96f, 7.15f, 14.96f, 7.16f, 14.97f, 7.17f)
                curveTo(14.98f, 7.18f, 14.99f, 7.18f, 14.99f, 7.19f)
                curveTo(15.01f, 7.22f, 15.02f, 7.26f, 15.04f, 7.3f)
                curveTo(15.06f, 7.35f, 15.09f, 7.39f, 15.1f, 7.44f)
                curveTo(15.11f, 7.49f, 15.11f, 7.53f, 15.12f, 7.58f)
                curveTo(15.12f, 7.63f, 15.13f, 7.67f, 15.13f, 7.72f)
                curveTo(15.13f, 7.77f, 15.11f, 7.81f, 15.09f, 7.86f)
                curveTo(15.07f, 7.91f, 15.06f, 7.96f, 15.04f, 8f)
                curveTo(15.02f, 8.04f, 14.98f, 8.08f, 14.95f, 8.12f)
                curveTo(14.92f, 8.15f, 14.91f, 8.19f, 14.88f, 8.21f)
                curveTo(14.87f, 8.22f, 14.86f, 8.22f, 14.85f, 8.23f)
                curveTo(14.84f, 8.24f, 14.84f, 8.25f, 14.83f, 8.25f)
                lineTo(12.89f, 9.67f)
                curveTo(12.76f, 9.77f, 12.6f, 9.81f, 12.45f, 9.81f)
                curveTo(12.22f, 9.81f, 11.99f, 9.7f, 11.84f, 9.5f)
                curveTo(11.6f, 9.17f, 11.67f, 8.7f, 12f, 8.45f)
                lineTo(12.56f, 8.04f)
                curveTo(12.37f, 8.03f, 12.19f, 8.01f, 12f, 8.01f)
                curveTo(9.66f, 8.01f, 7.75f, 9.92f, 7.75f, 12.26f)
                curveTo(7.75f, 14.6f, 9.66f, 16.51f, 12f, 16.51f)
                curveTo(14.34f, 16.51f, 16.25f, 14.6f, 16.25f, 12.26f)
                curveTo(16.25f, 11.41f, 16f, 10.6f, 15.54f, 9.9f)
                curveTo(15.31f, 9.56f, 15.4f, 9.09f, 15.75f, 8.86f)
                curveTo(16.09f, 8.63f, 16.56f, 8.72f, 16.79f, 9.07f)
                curveTo(17.42f, 10.02f, 17.76f, 11.12f, 17.76f, 12.26f)
                curveTo(17.75f, 15.44f, 15.17f, 18.01f, 12f, 18.01f)
                close()
            }
        }.build()

        return _RefreshRightSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshRightSquare: ImageVector? = null
