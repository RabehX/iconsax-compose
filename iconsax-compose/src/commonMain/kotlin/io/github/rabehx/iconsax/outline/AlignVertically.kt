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

val Iconsax.Outline.AlignVertically: ImageVector
    get() {
        if (_AlignVertically != null) {
            return _AlignVertically!!
        }
        _AlignVertically = ImageVector.Builder(
            name = "Outline.AlignVertically",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.4f, 20f)
                horizontalLineTo(6.6f)
                curveTo(4.68f, 20f, 3.75f, 19.02f, 3.75f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(3.75f, 13.98f, 4.68f, 13f, 6.6f, 13f)
                horizontalLineTo(17.4f)
                curveTo(19.32f, 13f, 20.25f, 13.98f, 20.25f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(20.25f, 19.02f, 19.32f, 20f, 17.4f, 20f)
                close()
                moveTo(6.6f, 14.5f)
                curveTo(5.59f, 14.5f, 5.25f, 14.71f, 5.25f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(5.25f, 18.29f, 5.59f, 18.5f, 6.6f, 18.5f)
                horizontalLineTo(17.4f)
                curveTo(18.41f, 18.5f, 18.75f, 18.29f, 18.75f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(18.75f, 14.71f, 18.41f, 14.5f, 17.4f, 14.5f)
                horizontalLineTo(6.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.4f, 11.5f)
                horizontalLineTo(8.6f)
                curveTo(6.68f, 11.5f, 5.75f, 10.52f, 5.75f, 8.52f)
                verticalLineTo(7.48f)
                curveTo(5.75f, 5.47f, 6.68f, 4.5f, 8.6f, 4.5f)
                horizontalLineTo(15.4f)
                curveTo(17.32f, 4.5f, 18.25f, 5.48f, 18.25f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(18.25f, 10.52f, 17.32f, 11.5f, 15.4f, 11.5f)
                close()
                moveTo(8.6f, 6f)
                curveTo(7.59f, 6f, 7.25f, 6.21f, 7.25f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(7.25f, 9.79f, 7.59f, 10f, 8.6f, 10f)
                horizontalLineTo(15.4f)
                curveTo(16.41f, 10f, 16.75f, 9.79f, 16.75f, 8.52f)
                verticalLineTo(7.48f)
                curveTo(16.75f, 6.21f, 16.41f, 6f, 15.4f, 6f)
                horizontalLineTo(8.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(19.6f)
                curveTo(11.25f, 19.19f, 11.59f, 18.85f, 12f, 18.85f)
                curveTo(12.41f, 18.85f, 12.75f, 19.19f, 12.75f, 19.6f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13f)
                verticalLineTo(11f)
                curveTo(11.25f, 10.59f, 11.59f, 10.25f, 12f, 10.25f)
                curveTo(12.41f, 10.25f, 12.75f, 10.59f, 12.75f, 11f)
                verticalLineTo(13f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 5.44f)
                curveTo(11.59f, 5.44f, 11.25f, 5.1f, 11.25f, 4.69f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.58f, 12.75f, 2f)
                verticalLineTo(4.69f)
                curveTo(12.75f, 5.11f, 12.41f, 5.44f, 12f, 5.44f)
                close()
            }
        }.build()

        return _AlignVertically!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVertically: ImageVector? = null
