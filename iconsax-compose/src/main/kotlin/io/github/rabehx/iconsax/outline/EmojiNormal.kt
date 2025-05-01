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

val Iconsax.Outline.EmojiNormal: ImageVector
    get() {
        if (_EmojiNormal != null) {
            return _EmojiNormal!!
        }
        _EmojiNormal = ImageVector.Builder(
            name = "Outline.EmojiNormal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.819f, 9.75f)
                curveTo(7.969f, 9.75f, 7.119f, 9.43f, 6.469f, 8.78f)
                curveTo(6.179f, 8.49f, 6.179f, 8.01f, 6.469f, 7.72f)
                curveTo(6.759f, 7.43f, 7.239f, 7.43f, 7.529f, 7.72f)
                curveTo(8.239f, 8.43f, 9.399f, 8.43f, 10.109f, 7.72f)
                curveTo(10.399f, 7.43f, 10.88f, 7.43f, 11.17f, 7.72f)
                curveTo(11.46f, 8.01f, 11.46f, 8.49f, 11.17f, 8.78f)
                curveTo(10.519f, 9.42f, 9.669f, 9.75f, 8.819f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.181f, 9.75f)
                curveTo(14.331f, 9.75f, 13.481f, 9.43f, 12.831f, 8.78f)
                curveTo(12.541f, 8.49f, 12.541f, 8.01f, 12.831f, 7.72f)
                curveTo(13.121f, 7.43f, 13.601f, 7.43f, 13.891f, 7.72f)
                curveTo(14.601f, 8.43f, 15.761f, 8.43f, 16.471f, 7.72f)
                curveTo(16.761f, 7.43f, 17.241f, 7.43f, 17.531f, 7.72f)
                curveTo(17.821f, 8.01f, 17.821f, 8.49f, 17.531f, 8.78f)
                curveTo(16.881f, 9.42f, 16.031f, 9.75f, 15.181f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.15f)
                curveTo(9.1f, 19.15f, 6.75f, 16.79f, 6.75f, 13.9f)
                curveTo(6.75f, 12.99f, 7.49f, 12.25f, 8.4f, 12.25f)
                horizontalLineTo(15.6f)
                curveTo(16.51f, 12.25f, 17.25f, 12.99f, 17.25f, 13.9f)
                curveTo(17.25f, 16.79f, 14.9f, 19.15f, 12f, 19.15f)
                close()
                moveTo(8.4f, 13.75f)
                curveTo(8.32f, 13.75f, 8.25f, 13.82f, 8.25f, 13.9f)
                curveTo(8.25f, 15.97f, 9.93f, 17.65f, 12f, 17.65f)
                curveTo(14.07f, 17.65f, 15.75f, 15.97f, 15.75f, 13.9f)
                curveTo(15.75f, 13.82f, 15.68f, 13.75f, 15.6f, 13.75f)
                horizontalLineTo(8.4f)
                close()
            }
        }.build()

        return _EmojiNormal!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiNormal: ImageVector? = null
