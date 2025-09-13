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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Pipette: ImageVector
    get() {
        if (_Pipette != null) {
            return _Pipette!!
        }
        _Pipette = ImageVector.Builder(
            name = "Outline.Pipette",
            defaultWidth = 1.dp,
            defaultHeight = 1.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.264f, 3.736f)
                arcToRelative(3.367f, 3.367f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.762f, 0f)
                lineToRelative(-1.455f, 1.456f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.061f, 0f)
                lineTo(11.894f, 4.1f)
                arcToRelative(0.794f, 0.794f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.122f, 1.123f)
                lineToRelative(8.005f, 8.005f)
                arcToRelative(0.794f, 0.794f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.123f, -1.122f)
                lineToRelative(-1.092f, -1.092f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineToRelative(1.456f, -1.456f)
                arcToRelative(3.367f, 3.367f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.762f)
                moveToRelative(-5.822f, -1.06f)
                arcToRelative(4.867f, 4.867f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.883f, 6.882f)
                lineToRelative(-0.926f, 0.926f)
                lineToRelative(0.562f, 0.561f)
                arcToRelative(2.294f, 2.294f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.244f, 3.244f)
                lineToRelative(-0.562f, -0.561f)
                lineToRelative(-6.094f, 6.093f)
                lineToRelative(-0.066f, 0.067f)
                curveToRelative(-0.39f, 0.391f, -0.695f, 0.696f, -1.07f, 0.894f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.792f, 0.278f)
                curveToRelative(-0.416f, 0.08f, -0.844f, 0.032f, -1.393f, -0.03f)
                lineToRelative(-0.094f, -0.01f)
                lineToRelative(-0.476f, -0.053f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.285f, -0.027f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.885f, 0.31f)
                curveToRelative(-0.035f, 0.03f, -0.072f, 0.066f, -0.205f, 0.2f)
                lineToRelative(-0.63f, 0.628f)
                arcToRelative(2.294f, 2.294f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.243f, -3.244f)
                lineToRelative(0.629f, -0.629f)
                curveToRelative(0.133f, -0.133f, 0.17f, -0.17f, 0.2f, -0.205f)
                curveToRelative(0.208f, -0.247f, 0.319f, -0.562f, 0.31f, -0.885f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.028f, -0.285f)
                lineToRelative(-0.053f, -0.476f)
                lineToRelative(-0.01f, -0.094f)
                curveToRelative(-0.061f, -0.549f, -0.11f, -0.977f, -0.03f, -1.394f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.277f, -0.791f)
                curveToRelative(0.2f, -0.375f, 0.504f, -0.68f, 0.895f, -1.07f)
                lineToRelative(0.067f, -0.067f)
                lineToRelative(6.093f, -6.093f)
                lineToRelative(-0.561f, -0.562f)
                arcToRelative(2.294f, 2.294f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.244f, -3.244f)
                lineToRelative(0.561f, 0.562f)
                close()
                moveTo(11.333f, 7.906f)
                lineToRelative(-6.094f, 6.093f)
                curveToRelative(-0.489f, 0.489f, -0.617f, 0.628f, -0.696f, 0.778f)
                quadToRelative(-0.093f, 0.175f, -0.13f, 0.369f)
                curveToRelative(-0.031f, 0.167f, -0.018f, 0.355f, 0.058f, 1.043f)
                lineToRelative(0.056f, 0.5f)
                curveToRelative(0.017f, 0.15f, 0.03f, 0.267f, 0.033f, 0.382f)
                curveToRelative(0.02f, 0.694f, -0.217f, 1.37f, -0.666f, 1.9f)
                curveToRelative(-0.075f, 0.087f, -0.158f, 0.17f, -0.265f, 0.277f)
                lineToRelative(-0.018f, 0.018f)
                lineToRelative(-0.628f, 0.629f)
                arcToRelative(0.794f, 0.794f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.122f, 1.122f)
                lineToRelative(0.647f, -0.646f)
                curveToRelative(0.107f, -0.107f, 0.19f, -0.19f, 0.277f, -0.265f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.9f, -0.666f)
                curveToRelative(0.115f, 0.003f, 0.231f, 0.016f, 0.382f, 0.033f)
                lineToRelative(0.5f, 0.056f)
                curveToRelative(0.688f, 0.076f, 0.876f, 0.09f, 1.043f, 0.058f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.369f, -0.13f)
                curveToRelative(0.15f, -0.08f, 0.289f, -0.207f, 0.778f, -0.696f)
                lineToRelative(1.438f, -1.439f)
                lineTo(10.116f, 16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(1.324f, 1.323f)
                lineToRelative(0.94f, -0.94f)
                lineTo(12.115f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(1.324f, 1.323f)
                lineToRelative(1.595f, -1.595f)
                close()
            }
        }.build()

        return _Pipette!!
    }

@Suppress("ObjectPropertyName")
private var _Pipette: ImageVector? = null
