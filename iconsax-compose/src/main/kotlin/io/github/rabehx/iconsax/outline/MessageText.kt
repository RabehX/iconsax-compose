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

val Iconsax.Outline.MessageText: ImageVector
    get() {
        if (_MessageText != null) {
            return _MessageText!!
        }
        _MessageText = ImageVector.Builder(
            name = "Outline.MessageText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.81f)
                curveTo(11.31f, 22.81f, 10.66f, 22.46f, 10.2f, 21.85f)
                lineTo(8.7f, 19.85f)
                curveTo(8.67f, 19.81f, 8.55f, 19.76f, 8.5f, 19.75f)
                horizontalLineTo(8f)
                curveTo(3.83f, 19.75f, 1.25f, 18.62f, 1.25f, 13f)
                verticalLineTo(8f)
                curveTo(1.25f, 3.58f, 3.58f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(20.42f, 1.25f, 22.75f, 3.58f, 22.75f, 8f)
                verticalLineTo(13f)
                curveTo(22.75f, 17.42f, 20.42f, 19.75f, 16f, 19.75f)
                horizontalLineTo(15.5f)
                curveTo(15.42f, 19.75f, 15.35f, 19.79f, 15.3f, 19.85f)
                lineTo(13.8f, 21.85f)
                curveTo(13.34f, 22.46f, 12.69f, 22.81f, 12f, 22.81f)
                close()
                moveTo(8f, 2.75f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 8f)
                verticalLineTo(13f)
                curveTo(2.75f, 17.52f, 4.3f, 18.25f, 8f, 18.25f)
                horizontalLineTo(8.5f)
                curveTo(9.01f, 18.25f, 9.59f, 18.54f, 9.9f, 18.95f)
                lineTo(11.4f, 20.95f)
                curveTo(11.75f, 21.41f, 12.25f, 21.41f, 12.6f, 20.95f)
                lineTo(14.1f, 18.95f)
                curveTo(14.43f, 18.51f, 14.95f, 18.25f, 15.5f, 18.25f)
                horizontalLineTo(16f)
                curveTo(19.58f, 18.25f, 21.25f, 16.58f, 21.25f, 13f)
                verticalLineTo(8f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 8.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 8.75f, 6.25f, 8.41f, 6.25f, 8f)
                curveTo(6.25f, 7.59f, 6.59f, 7.25f, 7f, 7.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 7.25f, 17.75f, 7.59f, 17.75f, 8f)
                curveTo(17.75f, 8.41f, 17.41f, 8.75f, 17f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 13.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 13.75f, 6.25f, 13.41f, 6.25f, 13f)
                curveTo(6.25f, 12.59f, 6.59f, 12.25f, 7f, 12.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 12.25f, 13.75f, 12.59f, 13.75f, 13f)
                curveTo(13.75f, 13.41f, 13.41f, 13.75f, 13f, 13.75f)
                close()
            }
        }.build()

        return _MessageText!!
    }

@Suppress("ObjectPropertyName")
private var _MessageText: ImageVector? = null
