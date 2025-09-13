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

val Iconsax.Outline.AlignHorizontally: ImageVector
    get() {
        if (_AlignHorizontally != null) {
            return _AlignHorizontally!!
        }
        _AlignHorizontally = ImageVector.Builder(
            name = "Outline.AlignHorizontally",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.02f, 20.25f)
                horizontalLineTo(6.98f)
                curveTo(4.97f, 20.25f, 4f, 19.32f, 4f, 17.4f)
                verticalLineTo(6.6f)
                curveTo(4f, 4.68f, 4.98f, 3.75f, 6.98f, 3.75f)
                horizontalLineTo(8.02f)
                curveTo(10.02f, 3.75f, 11f, 4.68f, 11f, 6.6f)
                verticalLineTo(17.4f)
                curveTo(11f, 19.32f, 10.02f, 20.25f, 8.02f, 20.25f)
                close()
                moveTo(6.98f, 5.25f)
                curveTo(5.71f, 5.25f, 5.5f, 5.59f, 5.5f, 6.6f)
                verticalLineTo(17.4f)
                curveTo(5.5f, 18.41f, 5.71f, 18.75f, 6.98f, 18.75f)
                horizontalLineTo(8.02f)
                curveTo(9.29f, 18.75f, 9.5f, 18.41f, 9.5f, 17.4f)
                verticalLineTo(6.6f)
                curveTo(9.5f, 5.59f, 9.29f, 5.25f, 8.02f, 5.25f)
                horizontalLineTo(6.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.52f, 18.25f)
                horizontalLineTo(15.48f)
                curveTo(13.47f, 18.25f, 12.5f, 17.32f, 12.5f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(12.5f, 6.68f, 13.48f, 5.75f, 15.48f, 5.75f)
                horizontalLineTo(16.52f)
                curveTo(18.53f, 5.75f, 19.5f, 6.68f, 19.5f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(19.5f, 17.32f, 18.52f, 18.25f, 16.52f, 18.25f)
                close()
                moveTo(15.48f, 7.25f)
                curveTo(14.21f, 7.25f, 14f, 7.59f, 14f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(14f, 16.41f, 14.21f, 16.75f, 15.48f, 16.75f)
                horizontalLineTo(16.52f)
                curveTo(17.79f, 16.75f, 18f, 16.41f, 18f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(18f, 7.59f, 17.79f, 7.25f, 16.52f, 7.25f)
                horizontalLineTo(15.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.4f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.58f, 11.25f, 2f, 11.25f)
                horizontalLineTo(4.4f)
                curveTo(4.81f, 11.25f, 5.15f, 11.59f, 5.15f, 12f)
                curveTo(5.15f, 12.41f, 4.82f, 12.75f, 4.4f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 12.75f)
                horizontalLineTo(11f)
                curveTo(10.59f, 12.75f, 10.25f, 12.41f, 10.25f, 12f)
                curveTo(10.25f, 11.59f, 10.59f, 11.25f, 11f, 11.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 11.25f, 13.75f, 11.59f, 13.75f, 12f)
                curveTo(13.75f, 12.41f, 13.41f, 12.75f, 13f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 12.75f)
                horizontalLineTo(19.301f)
                curveTo(18.891f, 12.75f, 18.551f, 12.41f, 18.551f, 12f)
                curveTo(18.551f, 11.59f, 18.891f, 11.25f, 19.301f, 11.25f)
                horizontalLineTo(22.001f)
                curveTo(22.411f, 11.25f, 22.751f, 11.59f, 22.751f, 12f)
                curveTo(22.751f, 12.41f, 22.421f, 12.75f, 22.001f, 12.75f)
                close()
            }
        }.build()

        return _AlignHorizontally!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontally: ImageVector? = null
