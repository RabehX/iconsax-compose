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

val Iconsax.Outline.MessageCircle: ImageVector
    get() {
        if (_MessageCircle != null) {
            return _MessageCircle!!
        }
        _MessageCircle = ImageVector.Builder(
            name = "Outline.MessageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.31f)
                curveTo(11.53f, 18.31f, 11.08f, 18.07f, 10.77f, 17.66f)
                lineTo(10.05f, 16.7f)
                horizontalLineTo(9.9f)
                curveTo(7.88f, 16.7f, 6f, 16.23f, 6f, 12.8f)
                verticalLineTo(10.17f)
                curveTo(6f, 7.86f, 7.19f, 6.49f, 9.34f, 6.3f)
                curveTo(9.5f, 6.28f, 9.69f, 6.27f, 9.9f, 6.27f)
                horizontalLineTo(14.1f)
                curveTo(16.61f, 6.27f, 18f, 7.65f, 18f, 10.17f)
                verticalLineTo(12.8f)
                curveTo(18f, 13f, 17.99f, 13.2f, 17.97f, 13.38f)
                curveTo(17.79f, 15.5f, 16.42f, 16.69f, 14.11f, 16.69f)
                horizontalLineTo(13.96f)
                lineTo(13.24f, 17.65f)
                curveTo(12.92f, 18.08f, 12.47f, 18.31f, 12f, 18.31f)
                close()
                moveTo(9.9f, 7.79f)
                curveTo(9.76f, 7.79f, 9.63f, 7.79f, 9.5f, 7.81f)
                curveTo(8.09f, 7.93f, 7.5f, 8.64f, 7.5f, 10.19f)
                verticalLineTo(12.82f)
                curveTo(7.5f, 14.89f, 8.07f, 15.22f, 9.9f, 15.22f)
                horizontalLineTo(10.16f)
                curveTo(10.54f, 15.22f, 10.95f, 15.42f, 11.18f, 15.72f)
                lineTo(11.97f, 16.78f)
                lineTo(12.82f, 15.73f)
                curveTo(13.06f, 15.41f, 13.44f, 15.22f, 13.84f, 15.22f)
                horizontalLineTo(14.1f)
                curveTo(15.65f, 15.22f, 16.35f, 14.63f, 16.47f, 13.25f)
                curveTo(16.49f, 13.09f, 16.49f, 12.96f, 16.49f, 12.82f)
                verticalLineTo(10.19f)
                curveTo(16.49f, 8.51f, 15.77f, 7.79f, 14.09f, 7.79f)
                horizontalLineTo(9.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _MessageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircle: ImageVector? = null
