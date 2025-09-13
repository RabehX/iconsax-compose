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

val Iconsax.Outline.UserTag: ImageVector
    get() {
        if (_UserTag != null) {
            return _UserTag!!
        }
        _UserTag = ImageVector.Builder(
            name = "Outline.UserTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.3f, 22.75f, 10.59f, 22.48f, 10.06f, 21.95f)
                lineTo(8.35f, 20.26f)
                curveTo(7.93f, 19.84f, 7.35f, 19.61f, 6.76f, 19.61f)
                horizontalLineTo(6f)
                curveTo(3.93f, 19.61f, 2.25f, 17.94f, 2.25f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(2.25f, 2.93f, 3.93f, 1.26f, 6f, 1.26f)
                horizontalLineTo(18f)
                curveTo(20.07f, 1.26f, 21.75f, 2.93f, 21.75f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21.75f, 17.94f, 20.07f, 19.61f, 18f, 19.61f)
                horizontalLineTo(17.24f)
                curveTo(16.65f, 19.61f, 16.07f, 19.85f, 15.65f, 20.26f)
                lineTo(13.94f, 21.95f)
                curveTo(13.41f, 22.48f, 12.7f, 22.75f, 12f, 22.75f)
                close()
                moveTo(6f, 2.75f)
                curveTo(4.76f, 2.75f, 3.75f, 3.75f, 3.75f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3.75f, 17.11f, 4.76f, 18.1f, 6f, 18.1f)
                horizontalLineTo(6.76f)
                curveTo(7.75f, 18.1f, 8.71f, 18.5f, 9.41f, 19.19f)
                lineTo(11.12f, 20.88f)
                curveTo(11.61f, 21.36f, 12.4f, 21.36f, 12.89f, 20.88f)
                lineTo(14.6f, 19.19f)
                curveTo(15.3f, 18.5f, 16.26f, 18.1f, 17.25f, 18.1f)
                horizontalLineTo(18f)
                curveTo(19.24f, 18.1f, 20.25f, 17.1f, 20.25f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(20.25f, 3.74f, 19.24f, 2.75f, 18f, 2.75f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 10.75f)
                curveTo(10.3f, 10.75f, 8.92f, 9.37f, 8.92f, 7.67f)
                curveTo(8.92f, 5.97f, 10.3f, 4.59f, 12f, 4.59f)
                curveTo(13.7f, 4.59f, 15.08f, 5.97f, 15.08f, 7.67f)
                curveTo(15.08f, 9.37f, 13.7f, 10.75f, 12f, 10.75f)
                close()
                moveTo(12f, 6.09f)
                curveTo(11.13f, 6.09f, 10.42f, 6.8f, 10.42f, 7.67f)
                curveTo(10.42f, 8.54f, 11.13f, 9.25f, 12f, 9.25f)
                curveTo(12.87f, 9.25f, 13.58f, 8.54f, 13.58f, 7.67f)
                curveTo(13.58f, 6.8f, 12.87f, 6.09f, 12f, 6.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 16.41f)
                curveTo(15.59f, 16.41f, 15.25f, 16.07f, 15.25f, 15.66f)
                curveTo(15.25f, 14.28f, 13.79f, 13.15f, 12f, 13.15f)
                curveTo(10.21f, 13.15f, 8.75f, 14.28f, 8.75f, 15.66f)
                curveTo(8.75f, 16.07f, 8.41f, 16.41f, 8f, 16.41f)
                curveTo(7.59f, 16.41f, 7.25f, 16.07f, 7.25f, 15.66f)
                curveTo(7.25f, 13.45f, 9.38f, 11.65f, 12f, 11.65f)
                curveTo(14.62f, 11.65f, 16.75f, 13.45f, 16.75f, 15.66f)
                curveTo(16.75f, 16.07f, 16.41f, 16.41f, 16f, 16.41f)
                close()
            }
        }.build()

        return _UserTag!!
    }

@Suppress("ObjectPropertyName")
private var _UserTag: ImageVector? = null
