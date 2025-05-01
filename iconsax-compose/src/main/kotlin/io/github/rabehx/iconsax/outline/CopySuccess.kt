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

val Iconsax.Outline.CopySuccess: ImageVector
    get() {
        if (_CopySuccess != null) {
            return _CopySuccess!!
        }
        _CopySuccess = ImageVector.Builder(
            name = "Outline.CopySuccess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.1f, 1.25f)
                horizontalLineTo(12.9f)
                curveTo(8.99f, 1.25f, 7.25f, 2.99f, 7.25f, 6.9f)
                verticalLineTo(8f)
                curveTo(7.25f, 8.41f, 7.59f, 8.75f, 8f, 8.75f)
                horizontalLineTo(11.1f)
                curveTo(14.2f, 8.75f, 15.25f, 9.8f, 15.25f, 12.9f)
                verticalLineTo(16f)
                curveTo(15.25f, 16.41f, 15.59f, 16.75f, 16f, 16.75f)
                horizontalLineTo(17.1f)
                curveTo(21.01f, 16.75f, 22.75f, 15.01f, 22.75f, 11.1f)
                verticalLineTo(6.9f)
                curveTo(22.75f, 2.99f, 21.01f, 1.25f, 17.1f, 1.25f)
                close()
                moveTo(8.75f, 7.25f)
                verticalLineTo(6.9f)
                curveTo(8.75f, 3.8f, 9.8f, 2.75f, 12.9f, 2.75f)
                horizontalLineTo(17.1f)
                curveTo(20.2f, 2.75f, 21.25f, 3.8f, 21.25f, 6.9f)
                verticalLineTo(11.1f)
                curveTo(21.25f, 14.2f, 20.2f, 15.25f, 17.1f, 15.25f)
                horizontalLineTo(16.75f)
                verticalLineTo(12.9f)
                curveTo(16.75f, 8.99f, 15.01f, 7.25f, 11.1f, 7.25f)
                horizontalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.1f, 7.25f)
                horizontalLineTo(6.9f)
                curveTo(2.99f, 7.25f, 1.25f, 8.99f, 1.25f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(1.25f, 21.01f, 2.99f, 22.75f, 6.9f, 22.75f)
                horizontalLineTo(11.1f)
                curveTo(15.01f, 22.75f, 16.75f, 21.01f, 16.75f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(16.75f, 8.99f, 15.01f, 7.25f, 11.1f, 7.25f)
                close()
                moveTo(6.9f, 21.25f)
                curveTo(3.8f, 21.25f, 2.75f, 20.2f, 2.75f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(2.75f, 9.8f, 3.8f, 8.75f, 6.9f, 8.75f)
                horizontalLineTo(11.1f)
                curveTo(14.2f, 8.75f, 15.25f, 9.8f, 15.25f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(15.25f, 20.2f, 14.2f, 21.25f, 11.1f, 21.25f)
                horizontalLineTo(6.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.03f, 17.7f)
                curveTo(7.84f, 17.7f, 7.65f, 17.63f, 7.5f, 17.48f)
                lineTo(5.55f, 15.53f)
                curveTo(5.26f, 15.24f, 5.26f, 14.76f, 5.55f, 14.47f)
                curveTo(5.84f, 14.18f, 6.32f, 14.18f, 6.61f, 14.47f)
                lineTo(8.03f, 15.89f)
                lineTo(11.389f, 12.53f)
                curveTo(11.679f, 12.24f, 12.16f, 12.24f, 12.45f, 12.53f)
                curveTo(12.74f, 12.82f, 12.74f, 13.3f, 12.45f, 13.59f)
                lineTo(8.55f, 17.48f)
                curveTo(8.41f, 17.62f, 8.22f, 17.7f, 8.03f, 17.7f)
                close()
            }
        }.build()

        return _CopySuccess!!
    }

@Suppress("ObjectPropertyName")
private var _CopySuccess: ImageVector? = null
