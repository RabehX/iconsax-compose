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

val Iconsax.Outline.Dislike: ImageVector
    get() {
        if (_Dislike != null) {
            return _Dislike!!
        }
        _Dislike = ImageVector.Builder(
            name = "Outline.Dislike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.8f, 22.1f)
                curveTo(10.51f, 22.1f, 10.22f, 22.05f, 9.95f, 21.95f)
                curveTo(8.7f, 21.54f, 7.9f, 20.16f, 8.18f, 18.88f)
                lineTo(8.67f, 15.73f)
                curveTo(8.68f, 15.66f, 8.68f, 15.56f, 8.61f, 15.48f)
                curveTo(8.56f, 15.43f, 8.49f, 15.4f, 8.41f, 15.4f)
                horizontalLineTo(4.41f)
                curveTo(3.43f, 15.4f, 2.58f, 14.99f, 2.08f, 14.28f)
                curveTo(1.59f, 13.59f, 1.49f, 12.68f, 1.81f, 11.8f)
                lineTo(4.2f, 4.52f)
                curveTo(4.57f, 3.07f, 6.12f, 1.9f, 7.72f, 1.9f)
                horizontalLineTo(11.52f)
                curveTo(12.08f, 1.9f, 13.3f, 2.07f, 13.95f, 2.72f)
                lineTo(16.98f, 5.06f)
                lineTo(16.06f, 6.25f)
                lineTo(12.96f, 3.85f)
                curveTo(12.71f, 3.6f, 12.08f, 3.4f, 11.52f, 3.4f)
                horizontalLineTo(7.72f)
                curveTo(6.82f, 3.4f, 5.85f, 4.12f, 5.65f, 4.93f)
                lineTo(3.23f, 12.28f)
                curveTo(3.07f, 12.72f, 3.1f, 13.12f, 3.31f, 13.41f)
                curveTo(3.53f, 13.72f, 3.93f, 13.9f, 4.42f, 13.9f)
                horizontalLineTo(8.42f)
                curveTo(8.94f, 13.9f, 9.42f, 14.12f, 9.75f, 14.5f)
                curveTo(10.09f, 14.89f, 10.24f, 15.41f, 10.16f, 15.95f)
                lineTo(9.66f, 19.16f)
                curveTo(9.54f, 19.72f, 9.92f, 20.35f, 10.46f, 20.53f)
                curveTo(10.94f, 20.71f, 11.58f, 20.45f, 11.8f, 20.13f)
                lineTo(15.9f, 14.03f)
                lineTo(17.14f, 14.87f)
                lineTo(13.04f, 20.97f)
                curveTo(12.57f, 21.67f, 11.68f, 22.1f, 10.8f, 22.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.619f, 18.1f)
                horizontalLineTo(18.619f)
                curveTo(16.769f, 18.1f, 15.869f, 17.23f, 15.869f, 15.45f)
                verticalLineTo(5.65f)
                curveTo(15.869f, 3.87f, 16.769f, 3f, 18.619f, 3f)
                horizontalLineTo(19.619f)
                curveTo(21.469f, 3f, 22.369f, 3.87f, 22.369f, 5.65f)
                verticalLineTo(15.45f)
                curveTo(22.369f, 17.23f, 21.469f, 18.1f, 19.619f, 18.1f)
                close()
                moveTo(18.619f, 4.5f)
                curveTo(17.529f, 4.5f, 17.369f, 4.76f, 17.369f, 5.65f)
                verticalLineTo(15.45f)
                curveTo(17.369f, 16.34f, 17.529f, 16.6f, 18.619f, 16.6f)
                horizontalLineTo(19.619f)
                curveTo(20.709f, 16.6f, 20.869f, 16.34f, 20.869f, 15.45f)
                verticalLineTo(5.65f)
                curveTo(20.869f, 4.76f, 20.709f, 4.5f, 19.619f, 4.5f)
                horizontalLineTo(18.619f)
                close()
            }
        }.build()

        return _Dislike!!
    }

@Suppress("ObjectPropertyName")
private var _Dislike: ImageVector? = null
