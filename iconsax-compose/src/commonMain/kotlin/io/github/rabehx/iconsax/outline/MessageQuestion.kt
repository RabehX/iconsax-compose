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

val Iconsax.Outline.MessageQuestion: ImageVector
    get() {
        if (_MessageQuestion != null) {
            return _MessageQuestion!!
        }
        _MessageQuestion = ImageVector.Builder(
            name = "Outline.MessageQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 22.32f)
                curveTo(7.72f, 22.32f, 7.43f, 22.25f, 7.17f, 22.11f)
                curveTo(6.6f, 21.81f, 6.25f, 21.21f, 6.25f, 20.57f)
                verticalLineTo(19.15f)
                curveTo(3.23f, 18.84f, 1.25f, 16.62f, 1.25f, 13.44f)
                verticalLineTo(7.44f)
                curveTo(1.25f, 4f, 3.56f, 1.69f, 7f, 1.69f)
                horizontalLineTo(17f)
                curveTo(20.44f, 1.69f, 22.75f, 4f, 22.75f, 7.44f)
                verticalLineTo(13.44f)
                curveTo(22.75f, 16.88f, 20.44f, 19.19f, 17f, 19.19f)
                horizontalLineTo(13.23f)
                lineTo(8.97f, 22.03f)
                curveTo(8.68f, 22.22f, 8.34f, 22.32f, 8f, 22.32f)
                close()
                moveTo(7f, 3.18f)
                curveTo(4.42f, 3.18f, 2.75f, 4.85f, 2.75f, 7.43f)
                verticalLineTo(13.43f)
                curveTo(2.75f, 16.01f, 4.42f, 17.68f, 7f, 17.68f)
                curveTo(7.41f, 17.68f, 7.75f, 18.02f, 7.75f, 18.43f)
                verticalLineTo(20.56f)
                curveTo(7.75f, 20.69f, 7.83f, 20.75f, 7.88f, 20.78f)
                curveTo(7.93f, 20.81f, 8.03f, 20.84f, 8.14f, 20.77f)
                lineTo(12.59f, 17.81f)
                curveTo(12.71f, 17.73f, 12.86f, 17.68f, 13.01f, 17.68f)
                horizontalLineTo(17.01f)
                curveTo(19.59f, 17.68f, 21.26f, 16.01f, 21.26f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(21.26f, 4.85f, 19.59f, 3.18f, 17.01f, 3.18f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.11f)
                curveTo(11.59f, 12.11f, 11.25f, 11.77f, 11.25f, 11.36f)
                verticalLineTo(11.15f)
                curveTo(11.25f, 9.99f, 12.1f, 9.42f, 12.42f, 9.2f)
                curveTo(12.79f, 8.95f, 12.91f, 8.78f, 12.91f, 8.52f)
                curveTo(12.91f, 8.02f, 12.5f, 7.61f, 12f, 7.61f)
                curveTo(11.5f, 7.61f, 11.09f, 8.02f, 11.09f, 8.52f)
                curveTo(11.09f, 8.93f, 10.75f, 9.27f, 10.34f, 9.27f)
                curveTo(9.93f, 9.27f, 9.59f, 8.93f, 9.59f, 8.52f)
                curveTo(9.59f, 7.19f, 10.67f, 6.11f, 12f, 6.11f)
                curveTo(13.33f, 6.11f, 14.41f, 7.19f, 14.41f, 8.52f)
                curveTo(14.41f, 9.66f, 13.57f, 10.23f, 13.26f, 10.44f)
                curveTo(12.87f, 10.7f, 12.75f, 10.87f, 12.75f, 11.15f)
                verticalLineTo(11.36f)
                curveTo(12.75f, 11.78f, 12.41f, 12.11f, 12f, 12.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.6f)
                curveTo(11.58f, 14.6f, 11.25f, 14.26f, 11.25f, 13.85f)
                curveTo(11.25f, 13.44f, 11.59f, 13.1f, 12f, 13.1f)
                curveTo(12.41f, 13.1f, 12.75f, 13.44f, 12.75f, 13.85f)
                curveTo(12.75f, 14.26f, 12.42f, 14.6f, 12f, 14.6f)
                close()
            }
        }.build()

        return _MessageQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _MessageQuestion: ImageVector? = null
