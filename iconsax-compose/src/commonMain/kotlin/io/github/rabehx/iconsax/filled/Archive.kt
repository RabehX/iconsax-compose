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

val Iconsax.Filled.Archive: ImageVector
    get() {
        if (_Archive != null) {
            return _Archive!!
        }
        _Archive = ImageVector.Builder(
            name = "Filled.Archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 9.75f)
                horizontalLineTo(8f)
                curveTo(7.31f, 9.75f, 6.75f, 10.31f, 6.75f, 11f)
                verticalLineTo(12.05f)
                curveTo(6.78f, 12.04f, 6.8f, 12.03f, 6.83f, 12.02f)
                curveTo(6.95f, 11.96f, 7.08f, 11.92f, 7.21f, 11.88f)
                curveTo(7.27f, 11.86f, 7.33f, 11.84f, 7.4f, 11.82f)
                curveTo(7.6f, 11.78f, 7.8f, 11.75f, 8.01f, 11.75f)
                horizontalLineTo(16.01f)
                curveTo(16.22f, 11.75f, 16.42f, 11.78f, 16.62f, 11.82f)
                curveTo(16.68f, 11.83f, 16.74f, 11.86f, 16.81f, 11.88f)
                curveTo(16.94f, 11.92f, 17.07f, 11.96f, 17.19f, 12.02f)
                curveTo(17.22f, 12.03f, 17.25f, 12.04f, 17.27f, 12.05f)
                verticalLineTo(11f)
                curveTo(17.25f, 10.31f, 16.69f, 9.75f, 16f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 13.25f)
                horizontalLineTo(8f)
                curveTo(7.31f, 13.25f, 6.75f, 13.81f, 6.75f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 15f, 10.25f, 15.34f, 10.25f, 15.75f)
                curveTo(10.25f, 16.71f, 11.04f, 17.5f, 12f, 17.5f)
                curveTo(12.96f, 17.5f, 13.75f, 16.71f, 13.75f, 15.75f)
                curveTo(13.75f, 15.34f, 14.09f, 15f, 14.5f, 15f)
                horizontalLineTo(17.25f)
                verticalLineTo(14.5f)
                curveTo(17.25f, 13.81f, 16.69f, 13.25f, 16f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 6.5f)
                horizontalLineTo(8f)
                curveTo(7.31f, 6.5f, 6.75f, 7.06f, 6.75f, 7.75f)
                verticalLineTo(8.56f)
                curveTo(7.13f, 8.37f, 7.55f, 8.25f, 8f, 8.25f)
                horizontalLineTo(16f)
                curveTo(16.45f, 8.25f, 16.87f, 8.37f, 17.25f, 8.56f)
                verticalLineTo(7.75f)
                curveTo(17.25f, 7.06f, 16.69f, 6.5f, 16f, 6.5f)
                close()
            }
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
                moveTo(19f, 16.5f)
                horizontalLineTo(18f)
                horizontalLineTo(15.16f)
                curveTo(14.82f, 17.93f, 13.53f, 19f, 12f, 19f)
                curveTo(10.47f, 19f, 9.18f, 17.93f, 8.84f, 16.5f)
                horizontalLineTo(6f)
                horizontalLineTo(5f)
                curveTo(4.59f, 16.5f, 4.25f, 16.16f, 4.25f, 15.75f)
                curveTo(4.25f, 15.34f, 4.59f, 15f, 5f, 15f)
                horizontalLineTo(5.25f)
                verticalLineTo(14.5f)
                verticalLineTo(14f)
                verticalLineTo(11f)
                verticalLineTo(7.75f)
                curveTo(5.25f, 6.23f, 6.48f, 5f, 8f, 5f)
                horizontalLineTo(16f)
                curveTo(17.52f, 5f, 18.75f, 6.23f, 18.75f, 7.75f)
                verticalLineTo(11f)
                verticalLineTo(14f)
                verticalLineTo(14.5f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                curveTo(19.41f, 15f, 19.75f, 15.34f, 19.75f, 15.75f)
                curveTo(19.75f, 16.16f, 19.41f, 16.5f, 19f, 16.5f)
                close()
            }
        }.build()

        return _Archive!!
    }

@Suppress("ObjectPropertyName")
private var _Archive: ImageVector? = null
