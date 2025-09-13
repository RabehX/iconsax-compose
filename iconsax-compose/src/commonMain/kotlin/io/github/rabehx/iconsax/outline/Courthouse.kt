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

val Iconsax.Outline.Courthouse: ImageVector
    get() {
        if (_Courthouse != null) {
            return _Courthouse!!
        }
        _Courthouse = ImageVector.Builder(
            name = "Outline.Courthouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 6.23f)
                curveTo(13.56f, 6.23f, 12.62f, 6.05f, 11.72f, 5.69f)
                curveTo(11.44f, 5.58f, 11.25f, 5.3f, 11.25f, 4.99f)
                verticalLineTo(1.99f)
                curveTo(11.25f, 1.74f, 11.37f, 1.51f, 11.58f, 1.37f)
                curveTo(11.79f, 1.23f, 12.05f, 1.2f, 12.28f, 1.29f)
                curveTo(13.71f, 1.86f, 15.29f, 1.86f, 16.72f, 1.29f)
                curveTo(16.95f, 1.2f, 17.21f, 1.23f, 17.42f, 1.37f)
                curveTo(17.63f, 1.51f, 17.75f, 1.74f, 17.75f, 1.99f)
                verticalLineTo(4.99f)
                curveTo(17.75f, 5.3f, 17.56f, 5.57f, 17.28f, 5.69f)
                curveTo(16.38f, 6.05f, 15.44f, 6.23f, 14.5f, 6.23f)
                close()
                moveTo(12.75f, 4.47f)
                curveTo(13.89f, 4.82f, 15.11f, 4.82f, 16.25f, 4.47f)
                verticalLineTo(3.02f)
                curveTo(15.1f, 3.3f, 13.9f, 3.3f, 12.75f, 3.02f)
                verticalLineTo(4.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8.75f)
                curveTo(11.59f, 8.75f, 11.25f, 8.41f, 11.25f, 8f)
                verticalLineTo(5f)
                curveTo(11.25f, 4.59f, 11.59f, 4.25f, 12f, 4.25f)
                curveTo(12.41f, 4.25f, 12.75f, 4.59f, 12.75f, 5f)
                verticalLineTo(8f)
                curveTo(12.75f, 8.41f, 12.41f, 8.75f, 12f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 22.75f)
                horizontalLineTo(4f)
                curveTo(3.59f, 22.75f, 3.25f, 22.41f, 3.25f, 22f)
                verticalLineTo(11f)
                curveTo(3.25f, 8.58f, 4.58f, 7.25f, 7f, 7.25f)
                horizontalLineTo(17f)
                curveTo(19.42f, 7.25f, 20.75f, 8.58f, 20.75f, 11f)
                verticalLineTo(22f)
                curveTo(20.75f, 22.41f, 20.41f, 22.75f, 20f, 22.75f)
                close()
                moveTo(4.75f, 21.25f)
                horizontalLineTo(19.25f)
                verticalLineTo(11f)
                curveTo(19.25f, 9.42f, 18.58f, 8.75f, 17f, 8.75f)
                horizontalLineTo(7f)
                curveTo(5.42f, 8.75f, 4.75f, 9.42f, 4.75f, 11f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.42f, 12.75f)
                horizontalLineTo(4.58f)
                curveTo(4.17f, 12.75f, 3.83f, 12.41f, 3.83f, 12f)
                curveTo(3.83f, 11.59f, 4.17f, 11.25f, 4.58f, 11.25f)
                horizontalLineTo(19.42f)
                curveTo(19.83f, 11.25f, 20.17f, 11.59f, 20.17f, 12f)
                curveTo(20.17f, 12.41f, 19.83f, 12.75f, 19.42f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.74f, 12f)
                horizontalLineTo(7.24f)
                verticalLineTo(22f)
                horizontalLineTo(8.74f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.74f, 12f)
                horizontalLineTo(11.24f)
                verticalLineTo(22f)
                horizontalLineTo(12.74f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.74f, 12f)
                horizontalLineTo(15.24f)
                verticalLineTo(22f)
                horizontalLineTo(16.74f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Courthouse!!
    }

@Suppress("ObjectPropertyName")
private var _Courthouse: ImageVector? = null
