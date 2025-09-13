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


val Iconsax.Filled.ExternalDrive: ImageVector
    get() {
        if (_ExternalDrive != null) {
            return _ExternalDrive!!
        }
        _ExternalDrive = ImageVector.Builder(
            name = "Filled.ExternalDrive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(8f)
                curveTo(5.79f, 2f, 4f, 3.79f, 4f, 6f)
                verticalLineTo(13.25f)
                curveTo(4f, 13.8f, 4.45f, 14.25f, 5f, 14.25f)
                horizontalLineTo(20f)
                curveTo(20.55f, 14.25f, 21f, 13.8f, 21f, 13.25f)
                verticalLineTo(6f)
                curveTo(21f, 3.79f, 19.21f, 2f, 17f, 2f)
                close()
                moveTo(8f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 11.25f, 8.75f, 11.59f, 8.75f, 12f)
                curveTo(8.75f, 12.41f, 8.41f, 12.75f, 8f, 12.75f)
                close()
                moveTo(8f, 10.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 10.25f, 6.25f, 9.91f, 6.25f, 9.5f)
                curveTo(6.25f, 9.09f, 6.59f, 8.75f, 7f, 8.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 8.75f, 8.75f, 9.09f, 8.75f, 9.5f)
                curveTo(8.75f, 9.91f, 8.41f, 10.25f, 8f, 10.25f)
                close()
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
                moveTo(4f, 16.75f)
                verticalLineTo(18f)
                curveTo(4f, 20.21f, 5.79f, 22f, 8f, 22f)
                horizontalLineTo(17f)
                curveTo(19.21f, 22f, 21f, 20.21f, 21f, 18f)
                verticalLineTo(16.75f)
                curveTo(21f, 16.2f, 20.55f, 15.75f, 20f, 15.75f)
                horizontalLineTo(5f)
                curveTo(4.45f, 15.75f, 4f, 16.2f, 4f, 16.75f)
                close()
                moveTo(17.71f, 19.46f)
                curveTo(17.52f, 19.64f, 17.26f, 19.75f, 17f, 19.75f)
                curveTo(16.74f, 19.75f, 16.48f, 19.64f, 16.29f, 19.46f)
                curveTo(16.11f, 19.27f, 16f, 19.01f, 16f, 18.75f)
                curveTo(16f, 18.49f, 16.11f, 18.23f, 16.29f, 18.04f)
                curveTo(16.66f, 17.67f, 17.33f, 17.67f, 17.71f, 18.04f)
                curveTo(17.89f, 18.23f, 18f, 18.49f, 18f, 18.75f)
                curveTo(18f, 19.01f, 17.89f, 19.27f, 17.71f, 19.46f)
                close()
            }
        }.build()

        return _ExternalDrive!!
    }

@Suppress("ObjectPropertyName")
private var _ExternalDrive: ImageVector? = null
