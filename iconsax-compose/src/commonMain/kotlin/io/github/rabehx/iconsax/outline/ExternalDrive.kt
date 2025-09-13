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

val Iconsax.Outline.ExternalDrive: ImageVector
    get() {
        if (_ExternalDrive != null) {
            return _ExternalDrive!!
        }
        _ExternalDrive = ImageVector.Builder(
            name = "Outline.ExternalDrive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(9f)
                curveTo(5.56f, 22.75f, 3.25f, 20.44f, 3.25f, 17f)
                verticalLineTo(7f)
                curveTo(3.25f, 3.56f, 5.56f, 1.25f, 9f, 1.25f)
                horizontalLineTo(16f)
                curveTo(19.44f, 1.25f, 21.75f, 3.56f, 21.75f, 7f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.44f, 19.44f, 22.75f, 16f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(6.42f, 2.75f, 4.75f, 4.42f, 4.75f, 7f)
                verticalLineTo(17f)
                curveTo(4.75f, 19.58f, 6.42f, 21.25f, 9f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.58f, 21.25f, 20.25f, 19.58f, 20.25f, 17f)
                verticalLineTo(7f)
                curveTo(20.25f, 4.42f, 18.58f, 2.75f, 16f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 15.75f)
                horizontalLineTo(4f)
                curveTo(3.59f, 15.75f, 3.25f, 15.41f, 3.25f, 15f)
                curveTo(3.25f, 14.59f, 3.59f, 14.25f, 4f, 14.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 14.25f, 21.75f, 14.59f, 21.75f, 15f)
                curveTo(21.75f, 15.41f, 21.41f, 15.75f, 21f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 11.25f, 8.75f, 11.59f, 8.75f, 12f)
                curveTo(8.75f, 12.41f, 8.41f, 12.75f, 8f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 10.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 10.25f, 6.25f, 9.91f, 6.25f, 9.5f)
                curveTo(6.25f, 9.09f, 6.59f, 8.75f, 7f, 8.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 8.75f, 8.75f, 9.09f, 8.75f, 9.5f)
                curveTo(8.75f, 9.91f, 8.41f, 10.25f, 8f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 7.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 7.75f, 6.25f, 7.41f, 6.25f, 7f)
                curveTo(6.25f, 6.59f, 6.59f, 6.25f, 7f, 6.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 6.25f, 8.75f, 6.59f, 8.75f, 7f)
                curveTo(8.75f, 7.41f, 8.41f, 7.75f, 8f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 19.5f)
                curveTo(16.74f, 19.5f, 16.48f, 19.39f, 16.29f, 19.21f)
                curveTo(16.11f, 19.02f, 16f, 18.76f, 16f, 18.5f)
                curveTo(16f, 18.23f, 16.11f, 17.98f, 16.29f, 17.79f)
                curveTo(16.57f, 17.51f, 17.01f, 17.42f, 17.38f, 17.58f)
                curveTo(17.5f, 17.63f, 17.61f, 17.7f, 17.71f, 17.79f)
                curveTo(17.89f, 17.98f, 18f, 18.24f, 18f, 18.5f)
                curveTo(18f, 18.76f, 17.89f, 19.02f, 17.71f, 19.21f)
                curveTo(17.61f, 19.3f, 17.51f, 19.37f, 17.38f, 19.42f)
                curveTo(17.26f, 19.47f, 17.13f, 19.5f, 17f, 19.5f)
                close()
            }
        }.build()

        return _ExternalDrive!!
    }

@Suppress("ObjectPropertyName")
private var _ExternalDrive: ImageVector? = null
