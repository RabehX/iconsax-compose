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

val Iconsax.Outline.FlashCircle1: ImageVector
    get() {
        if (_FlashCircle1 != null) {
            return _FlashCircle1!!
        }
        _FlashCircle1 = ImageVector.Builder(
            name = "Outline.FlashCircle1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.069f, 18.17f)
                curveTo(10.899f, 18.17f, 10.739f, 18.14f, 10.569f, 18.08f)
                curveTo(10.019f, 17.87f, 9.659f, 17.36f, 9.659f, 16.77f)
                verticalLineTo(13.47f)
                horizontalLineTo(8.679f)
                curveTo(8.119f, 13.47f, 7.629f, 13.15f, 7.399f, 12.65f)
                curveTo(7.169f, 12.14f, 7.259f, 11.57f, 7.629f, 11.15f)
                lineTo(11.889f, 6.31f)
                curveTo(12.279f, 5.87f, 12.879f, 5.72f, 13.429f, 5.93f)
                curveTo(13.979f, 6.14f, 14.339f, 6.65f, 14.339f, 7.24f)
                verticalLineTo(10.54f)
                horizontalLineTo(15.329f)
                curveTo(15.889f, 10.54f, 16.379f, 10.86f, 16.609f, 11.36f)
                curveTo(16.839f, 11.87f, 16.749f, 12.44f, 16.379f, 12.86f)
                lineTo(12.119f, 17.7f)
                curveTo(11.839f, 18f, 11.459f, 18.17f, 11.069f, 18.17f)
                close()
                moveTo(8.899f, 11.97f)
                horizontalLineTo(10.409f)
                curveTo(10.819f, 11.97f, 11.159f, 12.31f, 11.159f, 12.72f)
                verticalLineTo(16.5f)
                lineTo(15.099f, 12.03f)
                horizontalLineTo(13.589f)
                curveTo(13.179f, 12.03f, 12.839f, 11.69f, 12.839f, 11.28f)
                verticalLineTo(7.5f)
                lineTo(8.899f, 11.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 22.75f)
                curveTo(6.051f, 22.75f, 1.221f, 17.93f, 1.221f, 12f)
                curveTo(1.221f, 6.07f, 6.051f, 1.25f, 11.971f, 1.25f)
                curveTo(17.891f, 1.25f, 22.721f, 6.07f, 22.721f, 12f)
                curveTo(22.721f, 17.93f, 17.901f, 22.75f, 11.971f, 22.75f)
                close()
                moveTo(11.971f, 2.75f)
                curveTo(6.871f, 2.75f, 2.721f, 6.9f, 2.721f, 12f)
                curveTo(2.721f, 17.1f, 6.871f, 21.25f, 11.971f, 21.25f)
                curveTo(17.071f, 21.25f, 21.221f, 17.1f, 21.221f, 12f)
                curveTo(21.221f, 6.9f, 17.071f, 2.75f, 11.971f, 2.75f)
                close()
            }
        }.build()

        return _FlashCircle1!!
    }

@Suppress("ObjectPropertyName")
private var _FlashCircle1: ImageVector? = null
