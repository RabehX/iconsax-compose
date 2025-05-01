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

val Iconsax.Outline.Scissor: ImageVector
    get() {
        if (_Scissor != null) {
            return _Scissor!!
        }
        _Scissor = ImageVector.Builder(
            name = "Outline.Scissor",
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
                moveTo(8.42f, 11.65f)
                curveTo(6.95f, 11.65f, 5.75f, 10.45f, 5.75f, 8.98f)
                curveTo(5.75f, 7.51f, 6.95f, 6.3f, 8.42f, 6.3f)
                curveTo(9.89f, 6.3f, 11.09f, 7.5f, 11.09f, 8.98f)
                curveTo(11.09f, 10.46f, 9.9f, 11.65f, 8.42f, 11.65f)
                close()
                moveTo(8.42f, 7.8f)
                curveTo(7.77f, 7.8f, 7.25f, 8.33f, 7.25f, 8.98f)
                curveTo(7.25f, 9.63f, 7.78f, 10.15f, 8.42f, 10.15f)
                curveTo(9.06f, 10.15f, 9.59f, 9.62f, 9.59f, 8.98f)
                curveTo(9.59f, 8.34f, 9.07f, 7.8f, 8.42f, 7.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.42f, 17.7f)
                curveTo(6.95f, 17.7f, 5.75f, 16.5f, 5.75f, 15.02f)
                curveTo(5.75f, 13.54f, 6.95f, 12.35f, 8.42f, 12.35f)
                curveTo(9.89f, 12.35f, 11.09f, 13.55f, 11.09f, 15.02f)
                curveTo(11.09f, 16.49f, 9.9f, 17.7f, 8.42f, 17.7f)
                close()
                moveTo(8.42f, 13.85f)
                curveTo(7.77f, 13.85f, 7.25f, 14.38f, 7.25f, 15.02f)
                curveTo(7.25f, 15.66f, 7.78f, 16.2f, 8.42f, 16.2f)
                curveTo(9.06f, 16.2f, 9.59f, 15.67f, 9.59f, 15.02f)
                curveTo(9.59f, 14.37f, 9.07f, 13.85f, 8.42f, 13.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.16f, 14.94f)
                curveTo(9.93f, 14.94f, 9.71f, 14.84f, 9.56f, 14.64f)
                curveTo(9.31f, 14.31f, 9.38f, 13.84f, 9.71f, 13.59f)
                lineTo(17.05f, 8.1f)
                curveTo(17.38f, 7.85f, 17.85f, 7.92f, 18.1f, 8.25f)
                curveTo(18.35f, 8.58f, 18.28f, 9.05f, 17.95f, 9.3f)
                lineTo(10.61f, 14.79f)
                curveTo(10.47f, 14.89f, 10.32f, 14.94f, 10.16f, 14.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 16.03f)
                curveTo(17.34f, 16.03f, 17.19f, 15.98f, 17.05f, 15.88f)
                lineTo(9.71f, 10.39f)
                curveTo(9.38f, 10.14f, 9.31f, 9.67f, 9.56f, 9.34f)
                curveTo(9.81f, 9.01f, 10.28f, 8.94f, 10.61f, 9.19f)
                lineTo(17.95f, 14.68f)
                curveTo(18.28f, 14.93f, 18.35f, 15.4f, 18.1f, 15.73f)
                curveTo(17.95f, 15.93f, 17.73f, 16.03f, 17.5f, 16.03f)
                close()
            }
        }.build()

        return _Scissor!!
    }

@Suppress("ObjectPropertyName")
private var _Scissor: ImageVector? = null
